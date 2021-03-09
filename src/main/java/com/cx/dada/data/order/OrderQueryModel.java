package com.cx.dada.data.order;

import com.alibaba.fastjson.annotation.JSONField;


public class OrderQueryModel {

    @JSONField(name = "order_id")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
