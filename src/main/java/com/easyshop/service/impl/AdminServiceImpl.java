package com.easyshop.service.impl;

import com.easyshop.bean.Admin;
import com.easyshop.mapper.AdminMapper;
import com.easyshop.service.AdminService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuqi
 * @since 2018-12-10
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
