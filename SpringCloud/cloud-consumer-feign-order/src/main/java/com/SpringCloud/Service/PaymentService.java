package com.SpringCloud.Service;
import com.SpringCloud.pojo.CommonResult;
import com.SpringCloud.pojo.PayMent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@ComponentScan
@FeignClient(value = "Payment-provider")//使用Fe
public interface PaymentService  {
//    int create(PayMent payMent);
    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathParam("id")long id);
}