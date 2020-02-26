package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author chenchao
 * @Date 16:06 2020/2/22
 * @Description
 * @Param
 * @return
 **/

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaServerBackupsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBackupsApplication.class);
    }
}
