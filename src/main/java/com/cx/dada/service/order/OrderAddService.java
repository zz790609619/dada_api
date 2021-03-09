package com.cx.dada.service.order;


import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


public class OrderAddService extends BaseService {

    public OrderAddService(String params){
        super(UrlConstant.ORDER_ADD_URL, params);
    }
}
