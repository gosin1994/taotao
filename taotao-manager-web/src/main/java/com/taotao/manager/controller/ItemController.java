package com.taotao.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.manager.model.Item;
import com.taotao.manager.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author: gosin email:gx1008666@163.com
 * @Date: 2017/12/27 15:58
 */
@Controller
@RequestMapping(value = "/item")
public class ItemController {
    @Reference
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public String addItem() throws Exception {
        Item item = new Item();
        item.setId(System.currentTimeMillis()+(long) Math.random()*1000);
        item.setTitle("透明手机壳");
        item.setSellPoint("清仓大甩卖");
        item.setPrice(999L);
        item.setNum(10);
        item.setBarcode("No.00000001");
        item.setImage("http://image.itcast.cn/1.jpg");
        item.setCid(14L);
        item.setStatus(1);
        item.setCreated(new Date());
        item.setUpdated(item.getCreated());
        int acount = itemService.addItem(item);
        return ""+acount;
    }
}
