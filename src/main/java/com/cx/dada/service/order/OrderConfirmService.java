package com.cx.dada.service.order;


import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


public class OrderConfirmService extends BaseService {

    public OrderConfirmService(String params){
        super(UrlConstant.ORDER_CONFIRM_URL, params);
    }
}
