package com.tuling.parsebeandefinition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by smlz on 2019/7/15.
 */
@Configuration
@Import(value = {CompentC.class,TulingImportSelect.class,TulingImportBeanfinitionRegister.class})
@ComponentScan(basePackages = {"com.tuling.parsebeandefinition"})
public class MainConfig {

	@Bean
	public CompentD compentD() {
		return new CompentD();
	}
}
