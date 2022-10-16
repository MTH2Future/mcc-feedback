# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#web)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)



GET http://localhost:8093/mcc-feedback-api/feedbackByBookingId?bookingId=123
GET http://localhost:8093/mcc-feedback-api/feedback
GET http://localhost:8093/mcc-feedback-api/feedbackByCustomerId?customerId=1


REsponse :
[
    {
        "bookingId": "123",
        "customerId": 1,
        "questionId": 1,
        "answer": "yes"
    }
]

POST http://localhost:8093/mcc-feedback-api/feedback
PUT http://localhost:8093/mcc-feedback-api/feedback/{bookingid}

REquest :

{
    "bookingId": "234",
    "customerId":1,
    "questionId":"1",
    "answer":"yes"
}

REsponse :

{
    "bookingId": "234",
    "customerId": 1,
    "questionId": 1,
    "answer": "yes"
}

GET http://localhost:8093/mcc-feedback-api/rating
GET http://localhost:8093/mcc-feedback-api/ratingByCustomerId?customerId=2
GET http://localhost:8093/mcc-feedback-api/ratingByBookingId?bookingId=123

REsponse :

[
    {
        "bookingId": "123",
        "customerId": 1,
        "rating": 5,
        "comment": "good"
    },
    {
        "bookingId": "234",
        "customerId": 1,
        "rating": 4,
        "comment": "good"
    }
]

POST http://localhost:8093/mcc-feedback-api/rating
PUT http://localhost:8093/mcc-feedback-api/rating/{bookingid}

Request :
{
    "bookingId": "234",
    "customerId":1,
    "rating":4,
    "comment":"good"
}

Response :
{
    "bookingId": "234",
    "customerId":1,
    "rating":4,
    "comment":"good"
}

GET http://localhost:8093/mcc-feedback-api/questions

REsponse :

[
    {
        "question": "Would you recommend our sevices to a friend?",
        "questionId": 4
    },
    {
        "question": "Was the car in a good condition?",
        "questionId": 1
    },
    {
        "question": "Was the driver efficient?",
        "questionId": 2
    },
    {
        "question": "Was our services satisfactory?",
        "questionId": 3
    }
]





