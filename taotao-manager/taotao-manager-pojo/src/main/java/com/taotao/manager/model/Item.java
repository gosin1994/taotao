package com.taotao.manager.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表(TB_ITEM)
 * @Author: gosin email:gx1008666@163.com
 * @Date: 2017/12/27 12:57
 */
public class Item implements Serializable{
    /** 版本号 */
    private static final long serialVersionUID = -3564151450316077366L;

    /** 商品id，同时也是商品编号 */
    private Long id;

    /** 商品标题 */
    private String title;

    /** 商品卖点 */
    private String sellPoint;

    /** 商品价格，单位为：分 */
    private Long price;

    /** 库存数量 */
    private Integer num;

    /** 商品条形码 */
    private String barcode;

    /** 商品图片 */
    private String image;

    /** 所属类目，叶子类目 */
    private Long cid;

    /** 商品状态，1-正常，2-下架，3-删除 */
    private Integer status;

    /** 创建时间 */
    private Date created;

    /** 更新时间 */
    private Date updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
