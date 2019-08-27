package org.ntthuat.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/27 3:51 PM
 * $Log: CustomerRepositoryTest.java
 */
@Log4j2
@SpringBootApplication
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerRepositoryTest
{
  @Autowired
  private CustomerRepository customerRepository;

  @Test
  public void count()
  {
    log.info(customerRepository.count());
    System.out.println(customerRepository.count());
  }
}
