# A Simple Java API for Top Rated Movies

## Description
In this project, I implemented a simple web api that shows highest ranked movies.
I used Spring framework, Maven, and PostgreSQL DBMS.

## Endpoints

| Method | URL                                 | Description                      |
|--------|-------------------------------------|----------------------------------|
| `GET`  | `/api/movies`                       | Show most popular movies         |
| `GET`  | `/api/movies/{13}`                  | Retrieve movie #13               |
| `GET`  | `/api/genres/{horror}`              | Retrieve horror movies           |
| `GET`  | `/api/directors/{cristopher-nolan}` | Retrieve Cristopher Nolan movies |
| `GET`  | `/api/starts/{bradd-pitt}`          | Retrieve Bradd Pitt movies       |
| `GET`  | `/api/search`                       | Search movies                    |

<a href="https://www.kaggle.com/datasets/harshitshankhdhar/imdb-dataset-of-top-1000-movies-and-tv-shows">Dataset</a>