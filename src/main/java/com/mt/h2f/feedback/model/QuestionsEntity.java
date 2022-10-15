package com.mt.h2f.feedback.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "feedback_questions")
@EntityListeners(AuditingEntityListener.class)
public class QuestionsEntity {

	@Column(name = "question", nullable = false)
	private String question;

	@Id
	@Column(name = "question_id")
	private int questionId;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

}
