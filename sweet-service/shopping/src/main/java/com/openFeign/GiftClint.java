package com.openFeign;

import com.vo.SmsCoupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Objects;

@FeignClient("gift-service")
public interface GiftClint {

    @GetMapping("/gift/ids/{id}")
    List<SmsCoupon> queryByIds(@PathVariable(name = "id") Long id);
}
