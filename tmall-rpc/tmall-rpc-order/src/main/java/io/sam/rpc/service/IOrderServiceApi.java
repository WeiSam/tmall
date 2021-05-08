package io.sam.rpc.service;

import io.sam.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author zhuweimu
 * @description
 * @date 2021/5/8 11:01
 */
@FeignClient(name = "tmall-order")
public interface IOrderServiceApi {

    /**
     * 列表
     */
    @RequestMapping("order/order/list")
    R list(@RequestParam Map<String, Object> params);

    /**
     * 信息
     */
    @RequestMapping("order/order/info/{id}")
    R info(@PathVariable("id") Long id);
}
