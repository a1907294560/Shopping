package com.neuedu.service.impl;

import com.neuedu.mapper.UserInfoMapper;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    public int insert( UserInfo userInfo ) throws Exception {
        return 0;
    }
}
