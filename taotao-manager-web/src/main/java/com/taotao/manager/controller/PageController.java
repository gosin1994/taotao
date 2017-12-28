package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: gosin email:gx1008666@163.com~
 * @Date: 2017/12/27 10:11
 */
@RequestMapping(value = "/page")
@Controller
public class PageController {
    /**
     * 页面跳转
     * 输入  /rest/page/index  把index作为逻辑视图名字直接当参数获取，然后返回
     * @param pagename
     * @return
     */
    @RequestMapping(value = "/{pagename}")
    public String page(@PathVariable(value = "pagename")String pagename) {
        return pagename;
    }
}
