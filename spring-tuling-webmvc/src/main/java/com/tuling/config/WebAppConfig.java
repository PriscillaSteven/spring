package com.tuling.config;

import com.tuling.interceptor.TulingInterceptor;
import org.springframework.context.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
* @vlog: 高于生活，源于生活
* @desc: 类的描述 web子容器
* @author: smlz
* @createDate: 2019/7/31 20:22
* @version: 1.0
*/
@Configuration
@ComponentScan(basePackages = {"com.tuling"},includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {RestController.class})
},useDefaultFilters =false)
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer{

	@Bean
	public TulingInterceptor tulingInterceptor() {
		return new TulingInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(tulingInterceptor()).addPathPatterns("/*");
	}
}
