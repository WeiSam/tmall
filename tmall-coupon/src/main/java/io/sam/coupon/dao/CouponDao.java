package io.sam.coupon.dao;

import io.sam.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 14:06:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
