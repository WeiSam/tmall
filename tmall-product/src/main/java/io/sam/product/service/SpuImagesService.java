package io.sam.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sam.common.utils.PageUtils;
import io.sam.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:50:04
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

