package com.easyshop.service.impl;

import com.easyshop.bean.OrderItem;
import com.easyshop.mapper.OrderItemMapper;
import com.easyshop.service.OrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
