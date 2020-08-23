package com.lengedyun.entity;

/**
 * @author zjy
 * @title: DemoObj
 * @projectName springbase
 * @description: TODO
 * @date 2020/8/21 7:22
 */

public class DemoObj {

    private Long id;

    private String name;

    public DemoObj() {//空构造函数为必须的方法
        super();
    }

    public DemoObj(Long id, String name) {
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
