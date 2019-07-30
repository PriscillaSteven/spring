package com.tuling.circulardependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smlz on 2019/5/29.
 */
@Configuration
@ComponentScan(basePackages = {"com.tuling.circulardependencies"})
public class MainConfig {

	@Bean(initMethod = "init")
	public Person person() {
		return new Person();
	}

}
