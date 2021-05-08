package io.sam.member.dao;

import io.sam.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:52:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
