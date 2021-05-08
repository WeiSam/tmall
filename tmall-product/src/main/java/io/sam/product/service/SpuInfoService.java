package io.sam.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sam.common.utils.PageUtils;
import io.sam.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:50:04
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

