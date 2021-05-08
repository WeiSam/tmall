package io.sam.coupon.dao;

import io.sam.coupon.entity.SpuBoundsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品spu积分设置
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 14:06:25
 */
@Mapper
public interface SpuBoundsDao extends BaseMapper<SpuBoundsEntity> {
	
}
