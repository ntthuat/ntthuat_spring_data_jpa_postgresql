package org.ntthuat.repository;

import org.ntthuat.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by: ntthuat
 * $Revision: 1.0 $Date: 2019/08/27 5:08 PM
 * $Log: QuestionRepository.java
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>
{
}
