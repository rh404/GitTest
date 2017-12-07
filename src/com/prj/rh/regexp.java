package com.prj.rh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by suneee on 2017/9/15.
 */
public class regexp {

    public static void main(String[] args) {
        // 要验证的字符串
        //String str = "service@xsoftlab.net";
        String str = "000100000000";
        // 邮箱验证规则
        //String regEx = "[a-zA-Z_]{0,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
        //String regEx = "^[0-9]*[1-9][0-9]*$";
        //手机号
        //String regEx = "^1[34578]\\d{9}$";
        //固话
        //String regEx = "^(0\\d{2,3}-)?\\d{7,8}(-\\d{1,6})?$";
        //生日
        //String regEx = "^(19|20)\\d{2}(-|.)?(1[0-2]|0?[1-9])(-|.)?(0?[1-9]|[1-2][0-9]|3[0-1])$";
        //小数
        //String regEx = "^[1-9][0-9]+.[0-9]{4}$";
        //纬度
        //String regEx = "^(-)?([0-8]?\\d{1}\\.\\d{4}|90\\.0{4}|[0-8]?\\d{1})$";
        //经度
        //String regEx = "^(-)?(((\\d|[1-9]\\d|1[1-7]\\d|0)\\.\\d{0,4})|(\\d|[1-9]\\d|1[1-7]\\d|0{1,3})|180\\.0{0,4})$";
        //正小数
        //String regEx = "^[+]{0,1}(\\d+)$|^[+]{0,1}(\\d+\\.\\d+)$";
        //有效的生日
        //String regEx = "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";
        //判断是否有空格
        //String regEx = "^(\\S+)$";
        //可以零开头或多个但不能全是
        //String regEx = "^([0-9]{0,5}[1-9]{0,5}[0-9]{0,10})|([1-9]+)$";
        //不能以零开头的十位正整数
        String regEx = "^[^0\\D][0-9]{0,9}$";

        //String regEx = "^(([1-9][0-9]*)|(([0]\\.\\d{1,6}|[1-9][0-9]*\\.\\d{1,6})))$";

        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(rs);
    }

}
