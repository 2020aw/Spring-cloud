package com.shop.service;
import com.shop.entity.PmsBrand;
import com.baomidou.mybatisplus.extension.service.IService;
import dto.SmsCoupon;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author 雨芸
 * @since 2025-02-12
 */
public interface IPmsBrandService extends IService<PmsBrand> {

    List<SmsCoupon> queryByIds(Long id);
}
