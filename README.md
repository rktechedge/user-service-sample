## How to Run

```bash
mvn spring-boot:run

http://localhost:8081

GET API
http://localhost:8081/users/1

POST API
http://localhost:8081/users
Body
{
  "id": 6,
  "email": "wrong-email",
  "active": true

}
