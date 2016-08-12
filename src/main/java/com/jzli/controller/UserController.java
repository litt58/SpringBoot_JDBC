package com.jzli.controller;

import com.jzli.bean.User;
import com.jzli.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * =======================================================
 *
 * @Company 金色家网络科技有限公司-开发测试云服务部
 * @Date ：2016/7/6
 * @Author ：li.jinzhao
 * @Version ：0.0.1
 * @Description ：
 * ========================================================
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/user/{id}")
    public String getUserById(@PathVariable(value = "id") int id) {
        List<User> list = userService.getUserById(id);
        return list.toString();
    }

    @RequestMapping("/user/{id}/count")
    public String updateUserCount(@PathVariable(value = "id") int id) {
        userService.updateUserCountById(id);
        List<User> list = userService.getUserById(id);
        return list.toString();
    }

}
