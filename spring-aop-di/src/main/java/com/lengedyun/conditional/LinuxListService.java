package com.lengedyun.conditional;

/**
 * @author zjy
 * @title: LinuxListService
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 21:02
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
