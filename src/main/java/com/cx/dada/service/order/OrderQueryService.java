package com.cx.dada.service.order;


import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


public class OrderQueryService extends BaseService {

    public OrderQueryService(String params){
        super(UrlConstant.ORDER_DETAIL_URL, params);
    }
}
