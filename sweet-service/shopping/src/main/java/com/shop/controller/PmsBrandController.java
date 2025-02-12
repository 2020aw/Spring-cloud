package com.shop.controller;
import com.shop.service.IPmsBrandService;
import dto.SmsCoupon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shop.entity.PmsBrand;
import javax.annotation.Resource;
import java.util.List;


/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author 雨芸
 * @since 2025-02-12
 */
@RestController
@RequestMapping("/shop")
public class PmsBrandController {

    @Resource
    private IPmsBrandService pmsBrandService;
    @GetMapping(value = "/list")
    public List<PmsBrand> list(){
        return pmsBrandService.list();
    }

    @GetMapping(value = "/open")
    public String open(){
        List<SmsCoupon> objects = pmsBrandService.queryByIds(27L);
        System.out.println(objects.toString());
        return "OK";
    }
}
