package com.mysite.sbb.question;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// 생성된 테이블의 저장, 조회, 수정, 삭제 등을 할 수 있도록 도와주는 인터페이스
// 테이블에 접근하고, 데이터를 관리하는 메서드를 제공


public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);
}
