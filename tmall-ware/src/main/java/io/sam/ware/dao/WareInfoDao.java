package io.sam.ware.dao;

import io.sam.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:56:14
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
