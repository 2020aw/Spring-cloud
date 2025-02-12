package com.coupon.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.coupon.entity.SmsCoupon;
import com.coupon.service.ISmsCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 优惠券表 前端控制器
 * </p>
 *
 * @author 雨芸
 * @since 2025-02-12
 */
@RestController
@RequestMapping("/gift")
public class SmsCouponController {
    @Autowired
    private ISmsCouponService smsCouponService;

    @GetMapping(value = "/list")
    public List<SmsCoupon> list(){
        return smsCouponService.list();
    }

    @GetMapping(value = "/ids/{id}")
    public List<SmsCoupon> queryByIds(@PathVariable(name = "id") Long id){
        LambdaQueryWrapper<SmsCoupon> q = new LambdaQueryWrapper<>();
        q.eq(SmsCoupon::getId,id);
        return smsCouponService.list(q);
    }
}
