package io.sam.service;

import com.alibaba.fastjson.JSON;
import io.sam.BaseTest;
import io.sam.common.utils.R;
import io.sam.rpc.service.ICouponServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

/**
 * @author zhuweimu
 * @description
 * @date 2021/5/8 14:43
 */
@Slf4j
public class FeignServiceTest extends BaseTest {


    @Autowired
    ICouponServiceApi couponServiceApi;

    @Test
    public void orderFeign() {
        R list = couponServiceApi.list(new HashMap<>());
        log.info("R:{}", JSON.toJSONString(list));
    }
}
