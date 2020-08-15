package com.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName Goods
 * @Description: TODO
 * @Author lxc
 * @Date 2020/8/15 21:54
 * @Version V1.0
 **/
@Entity
@Table(name="goods")
public class Goods {
    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
    }
}
