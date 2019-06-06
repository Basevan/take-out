package com.tl.utils;

/**
 * @Author:Tang Fuwan
 * @Date:10:28 2019/6/6/006
 */
public class StringUtils {
    /**
     * 产生n位的随机数字验证码
     * @param length 数字长度
     * @return 返回随机验证码
     */
    public static String getRandomCode(int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            sb.append((int) (Math.random() * 10));
        }
        return sb.toString();
    }

    /**
     *
     * @Title: isEmpty
     * @Description: 检测字符串是否为null或去掉两端空格后是空串
     * @param checkStr
     * @return: boolean 如果是空 则返回true 否则返回false;
     */
    public static boolean isEmpty(String checkStr) {

        if (checkStr == null || "".equals(checkStr.trim())) {
            return true;
        } else {
            return false;
        }
    }
}
