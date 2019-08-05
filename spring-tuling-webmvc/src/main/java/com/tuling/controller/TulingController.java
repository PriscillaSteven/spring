package com.tuling.controller;

import com.tuling.service.TulingServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by smlz on 2019/7/31.
 */
@RestController
public class TulingController {

	@Autowired
	private TulingServiceImpl tulingServiceImpl;

	@RequestMapping("/tuling")
	public String testTuling() {
		tulingServiceImpl.sayHello();
		return "hello tuling";
	}

	public TulingController() {
		System.out.println("TulingController 执行构造方法");
	}


}
