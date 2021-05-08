package io.sam.service;

import io.sam.BaseTest;
import io.sam.coupon.entity.CouponEntity;
import io.sam.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhuweimu
 * @description
 * @date 2021/5/7 17:20
 */
@Slf4j
public class DaoService  extends BaseTest {

    @Autowired
    CouponService couponService;

    @Test
    public void testCoupondao() {
        List<CouponEntity> list = couponService.list();
        log.info("list:{}",list.toString());
    }
}
