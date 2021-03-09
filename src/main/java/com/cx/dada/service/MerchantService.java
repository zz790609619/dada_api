package com.cx.dada.service;

import com.alibaba.fastjson.JSON;
import com.cx.dada.config.AppConfig;
import com.cx.dada.data.DadaApiResponse;
import com.cx.dada.data.merchant.ShopAddModel;
import com.cx.dada.help.DadaRequestClient;
import com.cx.dada.service.merchant.CityCodeService;
import com.cx.dada.service.merchant.ShopAddService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ww
 */
@Service
public class MerchantService {

    /**
     * 获取城市信息列表
     * @return
     */
    public DadaApiResponse queryCityCode(){

        // 1.初始化配置
        AppConfig appConfig = new AppConfig();
        // 2.初始化service
        CityCodeService cityCodeService = new CityCodeService("");
        // 3.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(cityCodeService,appConfig);
        return dadaClient.callRpc();
    }

    /**
     * 新增门店
     * @return
     */
    public DadaApiResponse addShop() {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();
        // 2.初始化model
        ShopAddModel shopAddModel = new ShopAddModel();
        // 根据实际信息来填写门店地址
        shopAddModel.setStationName("成成spa01");
        shopAddModel.setBusiness(2);
        shopAddModel.setCityName("苏州");
        shopAddModel.setAreaName("吴中区");
        shopAddModel.setStationAddress("江苏省苏州市吴中区天灵路122号");
        shopAddModel.setLng(BigDecimal.valueOf(120.6383822202637));
        shopAddModel.setLat(BigDecimal.valueOf(31.251275926548389));
        shopAddModel.setContactName("王威");
        shopAddModel.setPhone("18550857425");

        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        List<ShopAddModel> shopAddList = new ArrayList<ShopAddModel>();
        shopAddList.add(shopAddModel);
        ShopAddService shopAddService = new ShopAddService(JSON.toJSONString(shopAddList));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(shopAddService, appConfig);
        return dadaClient.callRpc();
    }


}
