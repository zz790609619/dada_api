package com.cx.dada.data.merchant;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;


/**
 * @author ww
 */
public class ShopAddModel {

    /**
     * 门店编码,可自定义,但必须唯一;若不填写,则系统自动生成
     */
    @JSONField(name = "origin_shop_id")
    private String originShopId;

    /**
     * 门店名称
     */
    @JSONField(name = "station_name")
    private String stationName;

    /**
     * 业务类型(食品小吃-1,饮料-2,鲜花-3,文印票务-8,便利店-9,水果生鲜-13,同城电商-19, 医药-20,蛋糕-21,酒品-24,小商品市场-25,服装-26,汽修零配-27,数码-28,小龙虾-29,火锅-51,其他-5)
     */
    private Integer business;

    /**
     * 城市名称
     */
    @JSONField(name = "city_name")
    private String cityName;

    /**
     * 地区名称
     */
    @JSONField(name = "area_name")
    private String areaName;

    /**
     * 门店地址
     */
    @JSONField(name = "station_address")
    private String stationAddress;

    /**
     * 门店经度
     */
    private BigDecimal lng;
    /**
     * 门店纬度
     */
    private BigDecimal lat;

    /**
     * 联系人姓名
     */
    @JSONField(name = "contact_name")
    private String contactName;

    /**
     * 联系人电话
     */
    private String phone;

    public String getOriginShopId() {
        return originShopId;
    }

    public void setOriginShopId(String originShopId) {
        this.originShopId = originShopId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getBusiness() {
        return business;
    }

    public void setBusiness(Integer business) {
        this.business = business;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
