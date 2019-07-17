package com.yangguang.serviceImpl;

import com.yangguang.dao.TitleMapper;
import com.yangguang.entity.Title;
import com.yangguang.service.TitleService;
import com.yangguang.util.FinalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleMapper titleMapper;
    @Override
    public List<Title> selectAllTitle(String location) {

        List<Title> titles = titleMapper.selectByLocation(location);
        for (Title t:titles) {
            t.setTitleImg(FinalUtil.baseurl +t.getTitleImg());
        }
        return titles;
    }
}
