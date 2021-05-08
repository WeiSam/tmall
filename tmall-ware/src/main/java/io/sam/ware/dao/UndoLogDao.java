package io.sam.ware.dao;

import io.sam.ware.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:56:14
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
