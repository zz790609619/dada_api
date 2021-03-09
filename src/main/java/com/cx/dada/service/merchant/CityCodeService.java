package com.cx.dada.service.merchant;

import com.cx.dada.config.UrlConstant;
import com.cx.dada.service.BaseService;


/**
 * @author ww
 */
public class CityCodeService extends BaseService {

    public CityCodeService(String params){
        super(UrlConstant.CITY_CODE_URL, params);
    }
}
