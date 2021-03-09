package com.cx.dada.service;

import com.alibaba.fastjson.JSON;
import com.cx.dada.config.AppConfig;
import com.cx.dada.data.DadaApiResponse;
import com.cx.dada.data.merchant.ShopAddModel;
import com.cx.dada.data.order.OrderAddModel;
import com.cx.dada.data.order.OrderCancelModel;
import com.cx.dada.data.order.OrderConfirmModel;
import com.cx.dada.data.order.OrderQueryModel;
import com.cx.dada.help.DadaRequestClient;
import com.cx.dada.service.merchant.CityCodeService;
import com.cx.dada.service.merchant.ShopAddService;
import com.cx.dada.service.order.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ww
 */
@Service
public class OrderService {


    @Value("${callback.url}")
    public  String callBackUrl;
    /**
     * 新增订单
     * @return
     */
    public DadaApiResponse addOrder() {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();

        // 2.初始化model
        OrderAddModel orderAddModel = new OrderAddModel();
        orderAddModel.setShopNo("11664071");
        String id=String.valueOf(System.currentTimeMillis());
        System.out.println("新增订单id:"+id);
        orderAddModel.setOriginId(id);
        orderAddModel.setCityCode("021");
        orderAddModel.setCargoPrice(BigDecimal.valueOf(111));
        orderAddModel.setIsPrepay(0);
        // 填写收货人信息
        orderAddModel.setReceiverName("测试收货人");
        orderAddModel.setReceiverAddress("测试地址");
        orderAddModel.setReceiverLat(BigDecimal.valueOf(11.11111228623));
        orderAddModel.setReceiverLng(BigDecimal.valueOf(121.587172));
        orderAddModel.setReceiverPhone("xxxxxxxxxxx");
        // 设置回调url, 订单状态每次变更就会往该url发送通知(参见回调接口)
        System.out.println(callBackUrl);
        orderAddModel.setCallback(callBackUrl);

        // 3.初始化service
        OrderAddService orderService = new OrderAddService(JSON.toJSONString(orderAddModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderService, appConfig);
        return dadaClient.callRpc();


    }

    /**
     * 重发订单
     * @return
     */
    public DadaApiResponse reAddOrder() {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();

        // 2.初始化model
        OrderAddModel orderAddModel = new OrderAddModel();
        orderAddModel.setShopNo("11664071");
        String id=String.valueOf(System.currentTimeMillis());
        System.out.println("重发订单id:"+id);
        orderAddModel.setOriginId(id);
        orderAddModel.setCityCode("021");
        orderAddModel.setCargoPrice(BigDecimal.valueOf(111));
        orderAddModel.setIsPrepay(0);
        // 填写收货人信息
        orderAddModel.setReceiverName("测试收货人");
        orderAddModel.setReceiverAddress("测试地址");
        orderAddModel.setReceiverLat(BigDecimal.valueOf(11.11111228623));
        orderAddModel.setReceiverLng(BigDecimal.valueOf(121.587172));
        orderAddModel.setReceiverPhone("xxxxxxxxxxx");
        // 设置回调url, 订单状态每次变更就会往该url发送通知(参见回调接口)
        orderAddModel.setCallback(callBackUrl);

        // 3.初始化service
        OrderReAddService orderReService = new OrderReAddService(JSON.toJSONString(orderAddModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderReService, appConfig);
        return dadaClient.callRpc();


    }

    /**
     * 取消订单原因
     * @return
     */
    public DadaApiResponse cancelOrderReason() {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();

        // 3.初始化service
        OrderCancelReasonService orderCancelReasonService = new OrderCancelReasonService("");

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderCancelReasonService, appConfig);
        return dadaClient.callRpc();


    }


    /**
     * 取消订单
     * @return
     */
    public DadaApiResponse cancelOrder(String orderId,String reasonId) {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();

        // 2.初始化model
        OrderCancelModel orderCancelModel = new OrderCancelModel();
        orderCancelModel.setOrderId(orderId);
        orderCancelModel.setCancelReasonId(reasonId);

        // 3.初始化service
        OrderCancelService orderReService = new OrderCancelService(JSON.toJSONString(orderCancelModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderReService, appConfig);
        return dadaClient.callRpc();


    }


    /**
     * 订单详情
     * @return
     */
    public DadaApiResponse queryOrder(String orderId) {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();

        // 2.初始化model
        OrderQueryModel orderQueryModel = new OrderQueryModel();
        orderQueryModel.setOrderId(orderId);

        // 3.初始化service
        OrderQueryService orderQueryService = new OrderQueryService(JSON.toJSONString(orderQueryModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderQueryService, appConfig);
        return dadaClient.callRpc();

    }

    /**
     * 订单确认
     * @return
     */
    public DadaApiResponse confirmOrder(String orderId) {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig();

        // 2.初始化model
        OrderConfirmModel orderConfirmModel = new OrderConfirmModel();
        orderConfirmModel.setOrderId(orderId);

        // 3.初始化service
        OrderConfirmService orderConfirmService = new OrderConfirmService(JSON.toJSONString(orderConfirmModel));

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderConfirmService, appConfig);
        return dadaClient.callRpc();
    }

}