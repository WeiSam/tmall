package io.sam.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sam.common.utils.PageUtils;
import io.sam.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:52:59
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

