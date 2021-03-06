package io.sam.rpc.service;

import io.sam.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @FeignClient 远程调用
 * name:注册中心服务实例名称
 * qualifier:取bean名称别名
 * fallback:接口出错,降级类处理
 *
 *
 * @author zhuweimu
 * @description
 * @date 2021/5/8 11:01
 */
@FeignClient(name = "tmall-coupon")
public interface ICouponServiceApi {

    /**
     * 列表
     */
    @RequestMapping("/coupon/coupon/list")
    R list(@RequestParam Map<String, Object> params);

    /**
     * 信息
     */
    @RequestMapping("/coupon/coupon/info/{id}")
    R info(@PathVariable("id") Long id);
}
