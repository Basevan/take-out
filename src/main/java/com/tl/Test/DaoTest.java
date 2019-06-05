package com.tl.Test;

import javax.annotation.Resource;

import com.tl.Dao.defined.MerchantDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class DaoTest {

	@Resource
	private MerchantDao merchantDao;
	
	@Test
	public void test(){
		System.out.println(merchantDao.selectAll());
	}
	
}
