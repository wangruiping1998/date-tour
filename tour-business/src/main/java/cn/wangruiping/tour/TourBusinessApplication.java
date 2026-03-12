package cn.wangruiping.tour;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.wangruiping.tour.db.mapper")
@SpringBootApplication
public class TourBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(TourBusinessApplication.class, args);
        System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
    }

}
