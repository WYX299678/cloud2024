package com.atguigu.cloud.controller;
import com.atguigu.cloud.resp.ResultData;
import com.atguigu.cloud.serivce.StorageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName：StorageController
 * @Author: 33521
 * @Date: 2024/9/15 下午2:42
 * @Description: 必须描述类做什么事情, 实现什么功能
 */
@RestController
public class StorageController
{
    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public ResultData decrease(Long productId, Integer count) {

        storageService.decrease(productId, count);
        return ResultData.success("扣减库存成功!");
    }
}



