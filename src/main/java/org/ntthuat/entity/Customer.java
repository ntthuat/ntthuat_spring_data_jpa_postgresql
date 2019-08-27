package org.ntthuat.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/27 3:45 PM
 * $Log: Customer.java
 */
@Data
@Entity
@Table(name = "customer")
public class Customer
{
  private Long id;
  private String firstName;
  private String lastName;
}
