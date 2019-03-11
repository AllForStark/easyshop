package com.easyshop.service.impl;

import com.easyshop.bean.Item;
import com.easyshop.mapper.ItemMapper;
import com.easyshop.service.ItemService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author liuqi
 * @since 2018-12-11
 */
@Service
public class ItemServiceImpl extends ServiceImpl<ItemMapper, Item> implements ItemService {

}
