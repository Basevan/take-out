package com.tl.Controller;

import com.alibaba.fastjson.JSONObject;
import com.tl.Service.PageService;
import com.tl.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:Tang Fuwan
 * @Date:20:07 2019/6/5/005
 */
@Controller
@RequestMapping("/take-out/page")
public class PageController {

    @Autowired
    private PageService pageService;

    public JSONObject getMerchant(String lable){
        return ResultUtil.success(pageService.getMerchant(lable));
    }
}
