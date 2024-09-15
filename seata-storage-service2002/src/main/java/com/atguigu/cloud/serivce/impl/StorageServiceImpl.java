package com.atguigu.cloud.serivce.impl;
import com.atguigu.cloud.mapper.StorageMapper;
import com.atguigu.cloud.serivce.StorageService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
/**
 * @ClassName：StorageServiceImpl
 * @Author: 33521
 * @Date: 2024/9/15 下午2:41
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService
{

    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }
}
