package io.sam.ware.dao;

import io.sam.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:56:14
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
