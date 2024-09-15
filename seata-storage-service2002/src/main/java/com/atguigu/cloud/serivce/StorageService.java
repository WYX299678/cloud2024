package com.atguigu.cloud.serivce;

/**
 * @ClassName：StorageService
 * @Author: 33521
 * @Date: 2024/9/15 下午2:40
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
