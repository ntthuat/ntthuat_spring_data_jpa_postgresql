package org.ntthuat.repository;

import lombok.RequiredArgsConstructor;
import org.ntthuat.entity.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/27 3:49 PM
 * $Log: CustomerRepositoryImpl.java
 */
@Repository
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository
{

  private final JdbcTemplate jdbcTemplate;

  @Override
  public int count()
  {
    return jdbcTemplate
        .queryForObject("SELECT count(1) FROM customer", Integer.class);
  }

  @Override
  public int update()
  {
    return 0;
  }

  @Override
  public int save()
  {
    return 0;
  }

  @Override
  public int deleteById(Long id)
  {
    return 0;
  }

  @Override
  public List<Customer> findAll()
  {
    return new ArrayList<>();
  }

  @Override
  public List<Customer> findByLastName(String lastName)
  {
    return new ArrayList<>();
  }

  @Override
  public Optional<Customer> findById(Long id)
  {
    return Optional.empty();
  }

  @Override
  public String getNameById(Long id)
  {
    return null;
  }
}
