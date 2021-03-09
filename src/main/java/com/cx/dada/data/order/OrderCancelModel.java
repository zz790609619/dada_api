package com.cx.dada.data.order;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;


public class OrderCancelModel {

    @JSONField(name = "order_id")
    private String orderId;

    @JSONField(name = "cancel_reason_id")
    private String cancelReasonId;

    @JSONField(name = "cancel_reason")
    private String cancelReason;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCancelReasonId() {
        return cancelReasonId;
    }

    public void setCancelReasonId(String cancelReasonId) {
        this.cancelReasonId = cancelReasonId;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
}
