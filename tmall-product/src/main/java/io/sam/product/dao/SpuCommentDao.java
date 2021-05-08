package io.sam.product.dao;

import io.sam.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:50:04
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
