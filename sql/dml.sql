INSERT INTO mcc_feedback.feedback_questions(
	question_id, question)
	VALUES (3, 'Was our service satisfactory?');
	
INSERT INTO mcc_feedback.feedback_questions(
	question_id, question)
	VALUES (2, 'Was the driver efficient?');
	
INSERT INTO mcc_feedback.feedback_questions(
	question_id, question)
	VALUES (1, 'Was the car in a good condition?');
	
	INSERT INTO mcc_feedback.feedback_questions(
	question_id, question)
	VALUES (4, 'Would you recommend our sevices to a friend?');
	
INSERT INTO mcc_feedback.customer_feedback(
	booking_id, customer_id, question_id, answer)
	VALUES ('123', 1, 1, 'yes');
	
INSERT INTO mcc_feedback.customer_rating(
	booking_id, customer_id, rating, customer_comment)
	VALUES ('123', 1, 5, 'good');
