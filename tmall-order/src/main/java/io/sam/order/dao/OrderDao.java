package io.sam.order.dao;

import io.sam.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:36:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
