# Shopping App (Spring Boot)

## Setup (Eclipse + MySQL Workbench)

1. Create MySQL database (in MySQL Workbench):
   - Database name: `shopping_app`
   - Run the SQL script: `schema-and-data.sql` (provided in the project) OR create tables manually.

2. Import project into Eclipse:
   - File -> Import -> Existing Maven Projects -> select this project's folder.

3. Build & Run:
   - Run `ShoppingAppApplication` as Java application.
   - Open http://localhost:8080 or http://localhost:8080/login

4. Login:
   - Use any username and password (dummy authentication).

## Notes
- `application.properties` is preconfigured for:
  - username: `root`
  - password: `12345`
  - database: `shopping_app`
- JPA auto-ddl is disabled (`spring.jpa.hibernate.ddl-auto=none`) so tables will not be auto-created.

