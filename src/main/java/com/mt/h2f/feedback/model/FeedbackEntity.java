package com.mt.h2f.feedback.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "customer_feedback")
@EntityListeners(AuditingEntityListener.class)
public class FeedbackEntity {
	
	@Id
	@Column(name = "booking_id", nullable = false)
    private String bookingId;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "question_id", nullable = false)
    private long questionId;
    
    @Column(name = "answer", nullable = false)
    private String answer;

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
    
}
