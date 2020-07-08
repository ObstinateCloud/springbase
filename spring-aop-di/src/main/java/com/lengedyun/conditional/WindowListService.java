package com.lengedyun.conditional;

/**
 * @author zjy
 * @title: WindowListService
 * @projectName springbase
 * @description: TODO
 * @date 2020/7/8 21:02
 */
public class WindowListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
