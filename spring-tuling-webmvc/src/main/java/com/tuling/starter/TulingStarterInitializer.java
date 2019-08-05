package com.tuling.starter;

import com.tuling.config.RootConfig;
import com.tuling.config.WebAppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by smlz on 2019/7/31.
 */
public class TulingStarterInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * 方法实现说明:IOC 父容器的启动类
	 * @author:smlz
	 * @date:2019/7/31 22:12
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{RootConfig.class};
	}

	/**
	 * 方法实现说明 IOC子容器配置 web容器配置
	 * @author:smlz
	 * @date:2019/7/31 22:12
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebAppConfig.class};
	}

	/**
	 * 方法实现说明
	 * @author:smlz
	 * @return: 我们前端控制器DispatcherServlet的拦截路径
	 * @exception:
	 * @date:2019/7/31 22:16
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/*"};
	}
}
