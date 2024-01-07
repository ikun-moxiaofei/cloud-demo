package cn.itcast.feign.clients;


import cn.itcast.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// 服务名称
@FeignClient("user-service")
public interface UserClient {
    // 请求方式 // 请求路径
    @GetMapping("/user/{id}")
    // 返回值类型                    // 请求参数
    User findById(@PathVariable("id") Long id);
}
