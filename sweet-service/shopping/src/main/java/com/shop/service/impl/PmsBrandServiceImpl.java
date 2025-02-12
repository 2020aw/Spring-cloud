package com.shop.service.impl;

import com.openFeign.GiftClint;
import com.shop.entity.PmsBrand;
import com.shop.mapper.PmsBrandMapper;
import com.shop.service.IPmsBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vo.SmsCoupon;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author 雨芸
 * @since 2025-02-12
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements IPmsBrandService {

    @Resource
    private GiftClint clint;

    @Override
    public List<SmsCoupon> queryByIds(Long id) {
        return clint.queryByIds(id);
    }
}
