package io.sam.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.sam.common.utils.PageUtils;
import io.sam.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zhuweimu
 * @email zhuweimu@gmail.com
 * @date 2021-05-07 17:56:14
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

