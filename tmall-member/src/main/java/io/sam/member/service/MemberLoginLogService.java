package io.sam.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sam.common.utils.PageUtils;
import io.sam.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:52:59
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

