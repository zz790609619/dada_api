package com.cx.dada.service.order;


import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


public class OrderReAddService extends BaseService {

    public OrderReAddService(String params){
        super(UrlConstant.ORDER_RE_ADD_URL, params);
    }
}
