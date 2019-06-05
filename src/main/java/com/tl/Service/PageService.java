package com.tl.Service;

import com.alibaba.fastjson.JSONObject;
import com.tl.Dao.defined.MerchantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Tang Fuwan
 * @Date:20:08 2019/6/5/005
 */
@Service
public class PageService {

    @Autowired
    private MerchantDao merchantDao;

    public String getMerchant(String lable){
        if (lable.equals("全部商家"))
            return merchantDao.selectAll();
        else
            return "null";
    }
}
