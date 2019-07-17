package com.tuling.config;

import com.tuling.compent.TulingDao;
import com.tuling.compent.TulingDataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by smlz on 2019/7/7.
 */
@Configuration
//@ImportResource(value = {"classpath:beans.xml"})
//@ComponentScan(basePackages = {"com.tuling.compent"})
public class MainConfig {

	@Bean(autowire = Autowire.BY_TYPE)
	public TulingDao tulingDao() {

		return new TulingDao(tulingDataSource());
	}

	@Bean
	public TulingDataSource tulingDataSource() {
		return new TulingDataSource();
	}
}
