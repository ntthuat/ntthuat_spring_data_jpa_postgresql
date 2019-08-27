package org.ntthuat.repository;

import org.ntthuat.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository
{
  int count();

  int update();

  int save();

  int deleteById(Long id);

  List<Customer> findAll();

  List<Customer> findByLastName(String lastName);

  Optional<Customer> findById(Long id);

  String getNameById(Long id);
}
