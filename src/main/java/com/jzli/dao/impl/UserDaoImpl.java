package com.jzli.dao.impl;

import com.jzli.bean.User;
import com.jzli.dao.IUserDao;
import com.jzli.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    public List<User> getUserById(int id) {
        String sql = "select * from p_user where id=?";
        List<User> list = jdbcTemplate.query(sql, new Object[]{id}, userMapper);
        return list;
    }

    public void updateUserCountById(int id) {
        String sql = "update p_user set count=count+1 where id=?";
        jdbcTemplate.update(sql, id);
    }

}
