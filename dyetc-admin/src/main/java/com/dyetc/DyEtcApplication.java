package com.dyetc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author dyetc
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class DyEtcApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DyEtcApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  德银ETC启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
