package com.lengedyun.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author zjy
 * @title: DemoObj
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/21 7:22
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class DemoXmlObj {

    @XmlElement
    private Long id;

    @XmlElement
    private String name;

    public DemoXmlObj() {//空构造函数为必须的方法
        super();
    }

    public DemoXmlObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
