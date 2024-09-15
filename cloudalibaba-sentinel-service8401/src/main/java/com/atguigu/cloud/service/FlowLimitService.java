package com.atguigu.cloud.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @ClassName：FlowLimitService
 * @Author: 33521
 * @Date: 2024/9/13 下午7:30
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@Service
public class FlowLimitService
{
    @SentinelResource(value = "common")
    public void common()
    {
        System.out.println("------FlowLimitService come in");
    }
}
