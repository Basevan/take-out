package com.tl.Test;

import com.alibaba.fastjson.JSONObject;
import com.tl.Controller.PageController;
import com.tl.Service.PageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:Tang Fuwan
 * @Date:20:12 2019/6/5/005
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class ServiceTest {

    @Autowired
    private PageService pageService;

    @Autowired
    private PageController pageController;

    @Test
    public void testService(){
        String str = "全部商家";
        System.out.println(pageService.getMerchant(str));
    }

    @Test
    public void testController(){
        String str = "全部商家";
        JSONObject json = pageController.getMerchant(str);
        System.out.println(json.toJSONString());
    }
}
