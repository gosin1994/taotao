package com.taotao.manager.service;

import com.taotao.manager.model.Item;

/**
 * @Author: gosin email:gx1008666@163.com
 * @Date: 2017/12/27 15:04
 */
public interface ItemService {
    /**
     * 增加商品信息
     * @param name
     * @return
     * @throws Exception
     */
    int addItem(Item name) throws Exception;
}
