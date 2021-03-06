package com.lengedyun.config;

import com.lengedyun.converter.MyMessageConverter;
import com.lengedyun.interceptor.DemoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zjy
 * @title: MyMvcConfig
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/24 7:37
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.lengedyun")
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resolver =  new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/classes/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    //静态资源映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**")//对外暴露的访问路径
                .addResourceLocations("classpath:/assets/");

    }

    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    /*
    *  统一配置页面跳转
    */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/toUpload").setViewName("/upload");
        registry.addViewController("/toConverter").setViewName("/converter");
    }

    /**
     * .后面的内容不被忽略，路径中有.号
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }

    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setMaxUploadSize(1000000);
        resolver.setDefaultEncoding("UTF-8");
        return resolver;
    }

    //覆盖原有
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//
//    }

    //仅新注册，不覆盖原有
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        MyMessageConverter messageConverter = converter();
//        messageConverter.setSupportedMediaTypes(getSupportMediaTypes());
        converters.add(messageConverter);
    }

    @Bean
    public MyMessageConverter converter(){
        return new MyMessageConverter();
    }

    private List<MediaType> getSupportMediaTypes(){
        List<MediaType> supportedMediaTypes = new ArrayList<>();
        supportedMediaTypes.add(new MediaType("application","x-wisely"));
        return supportedMediaTypes;
    }


}
