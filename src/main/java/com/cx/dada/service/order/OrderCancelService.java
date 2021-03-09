package com.cx.dada.service.order;


import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


public class OrderCancelService extends BaseService {

    public OrderCancelService(String params){
        super(UrlConstant.ORDER_CANCEL_URL, params);
    }
}
