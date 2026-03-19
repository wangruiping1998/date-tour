package cn.wangruiping.tour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.wangruiping.tour.db.mapper")
@SpringBootApplication
public class TourBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(TourBusinessApplication.class, args);
    }

}
