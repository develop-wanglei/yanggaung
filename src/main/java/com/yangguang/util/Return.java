package com.yangguang.util;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;

import java.util.List;

public  class  Return {
    /*
    * 当数据是集合的时候
    * */
    public static String returnListInfo(List obj){
        JSONObject json = new JSONObject();
        if (obj.size() !=0){
            json.put("code",0);
            json.put("info","返回数据成功");
            json.put("data",obj);
            return json.toString();
        }else {
            json.put("code",1);
            json.put("info","未查询到数据！");
            json.put("data",null);
            return json.toString();
        }
    }
  /*
  * 当数据为单一类时
  * */
    public static String returnEntityInfo(Object obj){
        JSONObject json = new JSONObject();
        if (obj != null){
            json.put("code",0);
            json.put("info","返回数据成功");
            json.put("data",obj);
            return json.toString();
        }else {
            json.put("code",1);
            json.put("info","未查询到数据！");
            json.put("data",null);
            return json.toString();
        }
    }
    /*
    * 返回数据为修改多少行
    * */
    public static String returnIntInfo(Integer i){
        JSONObject json = new JSONObject();
        if (i >0){
            json.put("success",true);
            json.put("info","数据库数据已更新");
            return json.toString();
        }else {
            json.put("success",false);
            json.put("info","数据库数据更新失败");
            return json.toString();
        }
    }
    public static String returnPageHelper(PageInfo p){
        JSONObject json=new JSONObject();
        if(p.getSize()!=0){
            json.put("code",0);
            json.put("data",p);
            return json.toString();
        }else {
            json.put("code",1);
            json.put("info","未查询到数据！");
            return json.toString();
        }
    }
}
