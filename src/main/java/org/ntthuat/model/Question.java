package org.ntthuat.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/27 4:39 PM
 * $Log: Question.java
 */
@Entity
@Table(name = "question")
@Data
@ToString(callSuper = true)
public class Question extends AuditModel
{
  @Id
  @GeneratedValue(generator = "question_generator")
  @SequenceGenerator(
      name = "question_generator",
      sequenceName = "question_sequence",
      initialValue = 1000
  )
  private Long id;

  @NotBlank
  @Size(min = 3, max = 100)
  private String title;

  @Column(columnDefinition = "text")
  private String description;
}
