package com.tuling;

import com.tuling.compent.TulingDao;
import com.tuling.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by smlz on 2019/7/7.
 */
public class MainStart {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		TulingDao tulingDao = (TulingDao) ctx.getBean("tulingDao");
		System.out.println(tulingDao.getTulingDataSource());
	}
}
