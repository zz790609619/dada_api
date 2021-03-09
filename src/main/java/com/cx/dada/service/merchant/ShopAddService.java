package com.cx.dada.service.merchant;

import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


/**
 * @author ww
 */
public class ShopAddService extends BaseService {

    public ShopAddService(String params){
        super(UrlConstant.SHOP_ADD_URL, params);
    }
}
