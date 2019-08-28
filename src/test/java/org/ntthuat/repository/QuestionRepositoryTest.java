package org.ntthuat.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ntthuat.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/27 5:08 PM
 * $Log: QuestionRepositoryTest.java
 */
@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class QuestionRepositoryTest
{
  @Autowired
  private QuestionRepository questionRepository;

  @Test
  public void count()
  {
    System.out.println(questionRepository.count());
  }

  @Test
  public void save()
  {
    Question question = new Question();
    question.setTitle("Title 3");
    question.setDescription("Description 3");
    Question savedQuestion = questionRepository.save(question);
    System.out.println(savedQuestion);
  }

  @Test
  public void deleteByID()
  {
    questionRepository.deleteById(1301L);
    /*questionRepository.deleteById(1101L);*/
  }

}
