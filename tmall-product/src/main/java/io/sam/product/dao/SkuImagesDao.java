package io.sam.product.dao;

import io.sam.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku图片
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:50:04
 */
@Mapper
public interface SkuImagesDao extends BaseMapper<SkuImagesEntity> {
	
}
