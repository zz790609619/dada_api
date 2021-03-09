package com.cx.dada.api;

import com.alibaba.fastjson.JSON;
import com.cx.dada.data.order.OrderCallBackModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "demo示例")
@RestController
@RequestMapping("/api/DaDaCallBack")
public class DaDaCallBack {

    @ApiOperation(value = "接受订单")
    @PostMapping("/acceptOrder")
    public String acceptOrder(@RequestBody OrderCallBackModel orderCallBackModel) {
        System.out.println("订单状态更新:"+JSON.toJSONString(orderCallBackModel));
        return JSON.toJSONString(orderCallBackModel);
    }


}
