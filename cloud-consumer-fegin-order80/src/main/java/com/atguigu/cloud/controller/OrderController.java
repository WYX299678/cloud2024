package com.atguigu.cloud.controller;

import com.atguigu.cloud.apis.PayFeignApi;
import com.atguigu.cloud.entities.PayDTO;
import com.atguigu.cloud.resp.ResultData;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @auther zzyy
 * @create 2023-12-22 22:33
 */
@RestController
public class OrderController
{
   @Resource
    private PayFeignApi payFeignApi;

   @PostMapping(value = "/feign/pay/add")
   public ResultData add(@RequestBody PayDTO payDTO){
       ResultData resultData = payFeignApi.addPay(payDTO);
       return resultData;
   }
   @GetMapping(value = "/feign/pay/get/{id}")
   public ResultData getPayInfo(@PathVariable("id") Integer id){
       ResultData resultData = payFeignApi.getPayInfo(id);
       return resultData;
   }
    @GetMapping(value = "/feign/pay/mylb")
   public String mylb(){
       return payFeignApi.mylb();
   }

}
