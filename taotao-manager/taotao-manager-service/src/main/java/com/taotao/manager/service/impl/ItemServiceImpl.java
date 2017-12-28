package com.taotao.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.taotao.manager.mapper.ItemMapper;
import com.taotao.manager.model.Item;
import com.taotao.manager.service.ItemService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: gosin email:gx1008666@163.com
 * @Date: 2017/12/27 15:06
 */
@Component
@Service(interfaceClass = ItemService.class)
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemMapper itemMapper;
    
    /**
     * 增加商品信息
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public int addItem(Item name) throws Exception {
        return itemMapper.addItem(name);
    }
}
