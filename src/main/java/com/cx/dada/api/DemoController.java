package com.cx.dada.api;

import com.alibaba.fastjson.JSON;
import com.cx.dada.service.MerchantService;
import com.cx.dada.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@Api(tags = "demo示例")
@RestController
@RequestMapping("/api/dada")
public class DemoController {

    @Autowired
    private MerchantService merchantService;

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "获取城市信息列表")
    @GetMapping("/getCityList")
    public String getCityList() {
        return JSON.toJSONString(merchantService.queryCityCode());
    }



    @ApiOperation(value = "新增门店")
    @GetMapping("/addShop")
    public String addShop() {
        return JSON.toJSONString(merchantService.addShop());
    }

    @ApiOperation(value = "新增订单")
    @GetMapping("/addOrder")
    public String addOrder() {
        return JSON.toJSONString(orderService.addOrder());
    }

    @ApiOperation(value = "重发订单")
    @GetMapping("/reAddOrder")
    public String reAddOrder() {
        return JSON.toJSONString(orderService.reAddOrder());
    }

    @ApiOperation(value = "取消订单")
    @GetMapping("/cancelOrder")
    public String cancelOrder(@RequestParam("orderId") String orderId,@RequestParam("reasonId") String reasonId) {
        return JSON.toJSONString(orderService.cancelOrder(orderId,reasonId));
    }

    @ApiOperation(value = "取消订单原因")
    @GetMapping("/cancelOrderReason")
    public String cancelOrderReason() {
        return JSON.toJSONString(orderService.cancelOrderReason());
    }


    @ApiOperation(value = "订单查询")
    @GetMapping("/queryOrder")
    public String queryOrder(@RequestParam("orderId") String orderId) {
        return JSON.toJSONString(orderService.queryOrder(orderId));
    }

    @ApiOperation(value = "订单确认")
    @GetMapping("/confirmOrder")
    public String confirmOrder(@RequestParam("orderId") String orderId) {
        return JSON.toJSONString(orderService.confirmOrder(orderId));
    }


}
