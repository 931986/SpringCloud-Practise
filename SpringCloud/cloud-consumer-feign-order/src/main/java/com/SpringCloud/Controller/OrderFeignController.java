package com.SpringCloud.Controller;

import com.SpringCloud.Service.PaymentService;
import com.SpringCloud.pojo.CommonResult;
import com.SpringCloud.pojo.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class OrderFeignController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/consummer/payment/{id}")
    public CommonResult<PayMent> GetPaymentById(@PathVariable("id") long id){
        CommonResult result=paymentService.queryById(id);
        return result;
    }


}
