package com.yangguang.service;

import com.yangguang.entity.Title;

import java.util.List;

public interface TitleService {

    /*
    * 查询轮播图照片
    * */
    public List<Title> selectAllTitle(String location);

}
