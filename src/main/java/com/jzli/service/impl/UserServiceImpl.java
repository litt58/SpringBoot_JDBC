package com.jzli.service.impl;

import com.jzli.bean.User;
import com.jzli.dao.IUserDao;
import com.jzli.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    public List<User> getUserById(int id) {
        List<User> list = userDao.getUserById(id);
        return list;
    }

    @Transactional
    public void updateUserCountById(int id) {

        userDao.updateUserCountById(id);
        //测试事物
//        int id2 = id + 1;
//        List<User> user = userDao.getUserById(id2);
//        if (user != null && user.size() == 1) {
//            int i = 1 / 0;
//            userDao.updateUserCountById(id2);
//        }

    }
}
