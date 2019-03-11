package com.easyshop.service.impl;

import com.easyshop.bean.Order;
import com.easyshop.mapper.OrderMapper;
import com.easyshop.service.OrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuqi
 * @since 2018-12-06
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
