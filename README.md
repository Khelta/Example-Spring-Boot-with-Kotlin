# Example Spring Boot with Kotlin

Repository for testing out Spring Boot with Kotlin and the repository pattern.

### Usage

In ``application.properties`` fill in the database URL, username and password.

Run the application with ```./gradlew bootRun```

#### Endpoints

| Endpoint       | Method     | Details                 |
|----------------|------------|-------------------------|
| ``/``          | GET        | Displays "Hello World!" |
| ``/song``      | GET        | Gets all songs from DB  |
| ``/song``      | POST / PUT | Writes a song to DB     |
| ``/song/{id}`` | GET        | Gets a song by id       |
| ``/song/{id}`` | DELETE     | Deletes a song by id    |