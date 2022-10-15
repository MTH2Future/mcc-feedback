-- Table: mcc_feedback.feedback_questions

-- DROP TABLE IF EXISTS mcc_feedback.feedback_questions;

CREATE TABLE IF NOT EXISTS mcc_feedback.feedback_questions
(
    question_id bigint NOT NULL,
    question character varying COLLATE pg_catalog."default",
    CONSTRAINT feedback_questions_pkey PRIMARY KEY (question_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS mcc_feedback.feedback_questions
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS mcc_feedback.customer_feedback
(
    booking_id character varying COLLATE pg_catalog."default",
    customer_id bigint,
    question_id bigint,
    answer character varying COLLATE pg_catalog."default",
	 CONSTRAINT cfeedback_pkey PRIMARY KEY (booking_id),
	CONSTRAINT cfeedback_fkey FOREIGN KEY (booking_id)
        REFERENCES mcc_reservation.car_bookings (booking_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	CONSTRAINT cfeedback_cust_fkey FOREIGN KEY (customer_id)
        REFERENCES mcc_customer.customer (customer_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	CONSTRAINT feedback_question_fkey FOREIGN KEY (question_id)
        REFERENCES mcc_feedback.feedback_questions (question_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

ALTER TABLE IF EXISTS mcc_feedback.customer_feedback
    OWNER to postgres;
    
    CREATE TABLE IF NOT EXISTS mcc_feedback.customer_rating
(
    booking_id character varying COLLATE pg_catalog."default",
    customer_id bigint,
    rating bigint,
    customer_comment character varying COLLATE pg_catalog."default",
	 CONSTRAINT feedback_pkey PRIMARY KEY (booking_id),
	CONSTRAINT feedback_fkey FOREIGN KEY (booking_id)
        REFERENCES mcc_reservation.car_bookings (booking_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
	CONSTRAINT feedback_cust_fkey FOREIGN KEY (customer_id)
        REFERENCES mcc_customer.customer (customer_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);

ALTER TABLE IF EXISTS mcc_feedback.customer_rating
    OWNER to postgres;
