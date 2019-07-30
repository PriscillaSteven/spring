package com.tuling.compent;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 测试tulingDao
 * Created by smlz on 2019/7/7.
 */
@Component
public class TulingDao {

	@Autowired
	@Qualifier(value = "tulingDataSource")
	private TulingDataSource tulingDataSource2;

	public TulingDataSource getTulingDataSource() {
		return tulingDataSource2;
	}

	public void setTulingDataSource2(TulingDataSource tulingDataSource) {
		this.tulingDataSource2 = tulingDataSource;
	}

	public TulingDao(TulingDataSource tulingDataSource) {
		this.tulingDataSource2 = tulingDataSource;
		System.out.println("我是TulingDao的构造方法");
	}

	public TulingDao() {
		System.out.println("我是TulingDao的构造方法");
	}

}
