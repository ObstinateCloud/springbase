package com.lengedyun.converter;

import com.lengedyun.entity.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author zjy
 * @title: MyMessageConverter
 * @projectName springbase
 * @description: 处理request，和response数据
 * @date 2020/8/30 17:14
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {


    public MyMessageConverter() {
        super(new MediaType("application","x-wisely", Charset.forName("UTF-8")));//自定义媒体类型
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return true;//只处理demoobj这个类
    }

    //请求处理
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        System.out.println("eeeeeeqw");
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(),Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]),tempArr[1]);
    }
    //响应处理
    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:"+demoObj.getId()+"-"+demoObj.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
