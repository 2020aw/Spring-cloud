package client;
import dto.SmsCoupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient("gift-service")
public interface GiftClint {

    @GetMapping("/gift/ids/{id}")
    List<SmsCoupon> queryByIds(@PathVariable(name = "id") Long id);
}
