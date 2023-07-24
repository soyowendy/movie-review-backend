<h1 align="center">Movie Review - Back-End</h1>
<p align="center">The Back-End of the Movie Review System</p>

<div align="center">
  <img src="https://img.shields.io/badge/java-20-ed1d25?style=for-the-badge" alt="Java" />
  <img src="https://img.shields.io/badge/Spring-3.1.2-6db33f?style=for-the-badge" alt="Spring" />
  <img src="https://img.shields.io/badge/MongoDB-6.0.8-13aa52?style=for-the-badge" alt="MongoDB" />
  <img src="https://img.shields.io/badge/gradle-8.2-02303A?style=for-the-badge" alt="Gradle" />
  <img src="https://img.shields.io/badge/license-WTFPL-D92525?style=for-the-badge" alt="License" />
  <img src="https://img.shields.io/badge/status-finished-green?style=for-the-badge" alt="Status" />
</div>

<br/>

<img style="display: block; margin: 0 auto; border-radius: 3px;" src="banner.png" alt="Banner Project" />

## :page_with_curl: Description
In this project taught by FreeCodeCamp I worked on creating a movie review project.

[Click here to go to the front-end project.](https://github.com/soyowendy/movie-review-frontend)

## :computer: Technologies
 - Java
 - Gradle
 - Spring Boot
 - MongoDB

## :pushpin: Endpoints
| **Verb** |       **Endpoint**      |      **Return**     |
|:--------:|:-----------------------:|:-------------------:|
|    GET   | /api/v1/movies          | All Movies List     |
|    GET   | /api/v1/movies/_imdbId_ | Single Movie Object |
|   POST   | /api/v1/reviews         | Review Object       |

## :id: Objects
Please, ignore the `_class` in Objects...

### Id Object
```jsonc
{
	"timestamp": Timestamp,
	"date": String
}
```

### Movie Object
```jsonc
{
	"id": Object, /* Id Object */
	"imdbId": String,
	"title": String,
	"releaseDate": String,
	"trailerLink": String,
	"genres": String[],
	"poster": String,
	"backdrops": String[],
	"reviewIds": Object[] /* Review Object */
}
```

### Review Object
```jsonc
{
	"id": Object, /* Id Object */
	"body": String
}
```

## :electric_plug: Deploy
To use the project we need to prepare the Database, the Back-End and optionally the [Front-End](https://github.com/soyowendy/movie-review-frontend).

To start...

```bash
git clone https://github.com/soyowendy/movie-review-backend
cd movie-review-backend
```

### Database
The easiest way to prepare MongoDB is through Docker, follow the command below to prepare the database (via docker):

```bash
docker run --name movie-db -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=mongo -e MONGO_INITDB_ROOT_PASSWORD=mongo -d mongo
```

### Back-End
After running Docker with MongoDB, you need to configure the .env file with your database settings.

The .env file must be in the `src/main/java/resources` folder.

Below is an example of the `src/main/java/resources/.env` file

```dotenv
MONGO_DATABASE="movie-api-db" # The Collection name
MONGO_USER="mongo" # Username Mongo
MONGO_PASSWORD="mongo" # Password Mongo
MONGO_CLUSTER="localhost:27017" # The URI to Mongo
```

> When starting the back-end, Spring itself will populate the database with some movies.

So to initialize Spring, go to root project folder and use the following command:

```bash
./gradlew bootRun
```

### Front-End
[CHECK THE FRONT-END REPOSITORY](https://github.com/soyowendy/movie-review-frontend)

## :heavy_check_mark: Testing
You can test the requests using Curl, follow the examples below:

```bash
curl http://localhost:8080/api/v1/movies # To get all movies
```

```bash
curl http://localhost:8080/api/v1/movies/tt3915174 # To single movie
```

```bash
curl -d '{"reviewBody":"This is a very nice movie","imdbId":"tt3915174"}' \
	-H "Content-Type: application/json" \
	http://localhost:8080/api/v1/reviews # Send a Review to 'Puss in Cats 2' movie
```

## :technologist: Contributing
Despite being a base project, I still have several ideas of what can be done as an improvement, to find out what else can be done, check the issues.

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## :scroll: License
[WTFPL](LICENSE)
