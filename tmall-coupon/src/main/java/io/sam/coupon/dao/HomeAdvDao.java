package io.sam.coupon.dao;

import io.sam.coupon.entity.HomeAdvEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页轮播广告
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 14:06:25
 */
@Mapper
public interface HomeAdvDao extends BaseMapper<HomeAdvEntity> {
	
}
