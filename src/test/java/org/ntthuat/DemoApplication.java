package org.ntthuat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/28 9:45 AM
 * $Log: DemoApplication.java
 */
@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("org.ntthuat")
@EnableJpaRepositories("org.ntthuat")
@EntityScan("org.ntthuat.model")
public class DemoApplication
{
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
