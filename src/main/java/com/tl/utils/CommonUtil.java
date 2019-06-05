package com.tl.utils;

import com.alibaba.fastjson.JSONObject;

public class CommonUtil {

	public static JSONObject constructResponse(int code,String msg,Object data){
		JSONObject jo=new JSONObject();
		jo.put("code", code);
		jo.put("msg", msg);
		jo.put("data", data);
		return jo;
	}
}
