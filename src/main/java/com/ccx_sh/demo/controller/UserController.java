package com.ccx_sh.demo.controller;

import com.ccx_sh.demo.dao.CreateUserResponse;
import com.ccx_sh.demo.dao.User;
import com.ccx_sh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user/management")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CreateUserResponse createUser(@RequestBody @Valid User user){
        CreateUserResponse response = new CreateUserResponse();
        try {
            int userId = userService.createUser(user);
            response.setCode(0);
            response.setMessage("创建用户成功");
            response.setData(userId);
        }catch (Exception e){
            response.setCode(-1);
            response.setMessage("创建用户失败");
        }
        return response;

    }


}
