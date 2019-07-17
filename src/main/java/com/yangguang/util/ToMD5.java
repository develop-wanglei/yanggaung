package com.yangguang.util;

import org.springframework.util.DigestUtils;

public  class ToMD5 {

    public static String toMd5(String md5){
        md5="www."+md5+"wanglei0633.top";
        return DigestUtils.md5DigestAsHex(md5.getBytes());
    }
}
