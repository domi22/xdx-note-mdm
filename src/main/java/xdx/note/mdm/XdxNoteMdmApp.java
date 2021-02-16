package xdx.note.mdm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan(basePackages = {"xdx.note.mdm.mapper"})
@EnableDiscoveryClient
@SpringBootApplication
public class XdxNoteMdmApp {

    public static void main(String[] args) {
        SpringApplication.run(XdxNoteMdmApp.class, args);
    }




}
