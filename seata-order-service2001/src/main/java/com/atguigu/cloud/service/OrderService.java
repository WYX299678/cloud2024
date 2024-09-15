package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @ClassName：OrderService
 * @Author: 33521
 * @Date: 2024/9/15 下午2:28
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
