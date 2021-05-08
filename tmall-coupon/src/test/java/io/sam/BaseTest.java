package io.sam;

import io.sam.coupon.MallCoupon;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhuweimu
 * @classname BaseTest
 * @description
 * @date 2020/9/18 16:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MallCoupon.class})
public class BaseTest {
}
