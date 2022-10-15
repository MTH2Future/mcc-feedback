package com.mt.h2f.feedback.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "customer_rating")
@EntityListeners(AuditingEntityListener.class)
public class RatingEntity {
	
	@Id
	@Column(name = "booking_id", nullable = false)
    private String bookingId;

    @Column(name = "customer_id", nullable = false)
    private long customerId;

    @Column(name = "rating", nullable = false)
    private int rating;
    
    @Column(name = "customer_comment", nullable = false)
    private String comment;

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
