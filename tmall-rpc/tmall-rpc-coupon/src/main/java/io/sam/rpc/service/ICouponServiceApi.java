package io.sam.rpc.service;

import io.sam.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author zhuweimu
 * @description
 * @date 2021/5/8 11:01
 */
@FeignClient(name = "tmall-coupon")
public interface ICouponServiceApi {

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params);
}
