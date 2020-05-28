package com.lengedyun.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author zjy
 * @title: DemoSingletonService
 * @projectName springbase
 * @description: PrototypeBean 每次都创建新的实例
 * @date 2020/5/29 7:04
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {


}
