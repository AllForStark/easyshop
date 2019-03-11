package com.easyshop.service.impl;

import com.easyshop.bean.User;
import com.easyshop.mapper.UserMapper;
import com.easyshop.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author liuqi
 * @since 2018-12-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
