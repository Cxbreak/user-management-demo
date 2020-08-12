package com.ccx_sh.demo.serviceImpl;

import com.alibaba.druid.support.json.JSONUtils;
import com.ccx_sh.demo.dao.User;
import com.ccx_sh.demo.domain.UserEntity;
import com.ccx_sh.demo.mapper.UserEntityMapper;
import com.ccx_sh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Override
    public int createUser(User user) {
//        UserEntity oldUserEntity = userEntityMapper.queryByUserName(user.getUsername());
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setMobile(user.getMobile());
        userEntity.setEmail(user.getEmail());
        userEntity.setSex(user.getSex());
        userEntity.setNickname(user.getNickname());

        return userEntityMapper.insert(userEntity);
    }
}
