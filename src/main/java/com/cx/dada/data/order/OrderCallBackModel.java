package com.cx.dada.data.order;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;


/**
 * @author ww
 */
public class OrderCallBackModel {

    /**
     * 达达运单号
     */
    @JSONField(name = "client_id")
    private String client_id;

    /**
     * 订单id
     */
    @JSONField(name = "order_id")
    private String order_id;

    /**
     * 订单状态(待接单＝1,待取货＝2,配送中＝3,已完成＝4,已取消＝5, 指派单=8,妥投异常之物品返回中=9, 妥投异常之物品返回完成=10, 骑士到店=100,创建达达运单失败=1000 可参考文末的状态说明）
     */
    @JSONField(name = "order_status")
    private Integer order_status;

    /**
     * 取消原因
     */
    @JSONField(name = "cancel_reason")
    private String cancel_reason;

    /**
     * 订单取消原因来源(1:达达配送员取消；2:商家主动取消；3:系统或客服取消；0:默认值)
     */
    @JSONField(name = "cancel_from")
    private Integer cancel_from;

    /**
     * 更新时间，时间戳除了创建达达运单失败=1000的精确毫秒，其他时间戳精确到秒
     */
    @JSONField(name = "update_time")
    private Long update_time;

    /**
     * 对client_id, order_id, update_time的值进行字符串升序排列，再连接字符串，取md5值
     */
    @JSONField(name = "signature")
    private String signature;

    /**
     * 达达配送员id，接单以后会传
     */
    @JSONField(name = "dm_id")
    private Integer dm_id;

    /**
     * 配送员姓名，接单以后会传
     */
    @JSONField(name = "dm_name")
    private String dm_name;


    /**
     * 配送员手机号，接单以后会传
     */
    @JSONField(name = "dm_mobile")
    private String dm_mobile;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Integer getCancel_from() {
        return cancel_from;
    }

    public void setCancel_from(Integer cancel_from) {
        this.cancel_from = cancel_from;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Integer getDm_id() {
        return dm_id;
    }

    public void setDm_id(Integer dm_id) {
        this.dm_id = dm_id;
    }

    public String getDm_name() {
        return dm_name;
    }

    public void setDm_name(String dm_name) {
        this.dm_name = dm_name;
    }

    public String getDm_mobile() {
        return dm_mobile;
    }

    public void setDm_mobile(String dm_mobile) {
        this.dm_mobile = dm_mobile;
    }
}
