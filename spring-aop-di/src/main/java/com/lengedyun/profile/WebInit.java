package com.lengedyun.profile;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author zjy
 * @title: WebInit
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/5 22:37
 */
public class WebInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
            servletContext.setInitParameter("spring.profiles.default","dev");

    }
}
