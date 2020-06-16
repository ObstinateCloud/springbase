package com.lengedyun.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: DemoElService
 * @projectName springbase
 * @description: TODO
 * @date 2020/5/29 7:38
 */
@Service
public class DemoElService {

    @Value("其他类的属性")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
