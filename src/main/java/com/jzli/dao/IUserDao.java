package com.jzli.dao;

import com.jzli.bean.User;

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
public interface IUserDao {
    /**
     * 获取指定Id的User
     * @param id
     * @return
     */
    List<User> getUserById(int id);

    /**
     * 将指定Id的User的count加一
     * @param id
     */
    void updateUserCountById(int id);
}
