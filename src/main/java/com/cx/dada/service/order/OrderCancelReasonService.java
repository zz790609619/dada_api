package com.cx.dada.service.order;


import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


public class OrderCancelReasonService extends BaseService {

    public OrderCancelReasonService(String params){
        super(UrlConstant.ORDER_CANCEL_REASON_URL, params);
    }
}
