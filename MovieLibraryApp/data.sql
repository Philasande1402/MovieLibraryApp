CREATE TABLE Movies (
    id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    title VARCHAR(255),
    director VARCHAR(255),
    release_year INT,
    rating DECIMAL(2,1),
    duration INT, -- Duration in minutes
    genre VARCHAR(100),
    stock INT
);

INSERT INTO Movies (title, director, release_year, rating, duration, genre, stock) VALUES
('Inception', 'Christopher Nolan', 2010, 8.8, 148, 'Science Fiction', 5),
('The Godfather', 'Francis Ford Coppola', 1972, 9.2, 175, 'Crime', 3),
('The Dark Knight', 'Christopher Nolan', 2008, 9.0, 152, 'Action', 4),
('Pulp Fiction', 'Quentin Tarantino', 1994, 8.9, 154, 'Crime', 2),
('The Shawshank Redemption', 'Frank Darabont', 1994, 9.3, 142, 'Drama', 6),
('Interstellar', 'Christopher Nolan', 2014, 8.6, 169, 'Science Fiction', 3),
('Parasite', 'Bong Joon Ho', 2019, 8.6, 132, 'Thriller', 4),
('The Matrix', 'Lana Wachowski', 1999, 8.7, 136, 'Science Fiction', 5),
('Forrest Gump', 'Robert Zemeckis', 1994, 8.8, 142, 'Drama', 7),
('Fight Club', 'David Fincher', 1999, 8.8, 139, 'Drama', 3),
('The Lord of the Rings: The Return of the King', 'Peter Jackson', 2003, 8.9, 201, 'Fantasy', 2),
('Gladiator', 'Ridley Scott', 2000, 8.5, 155, 'Action', 4),
('Titanic', 'James Cameron', 1997, 7.8, 195, 'Romance', 5),
('Avatar', 'James Cameron', 2009, 7.8, 162, 'Science Fiction', 6),
('The Avengers', 'Joss Whedon', 2012, 8.0, 143, 'Action', 5),
('Jurassic Park', 'Steven Spielberg', 1993, 8.1, 127, 'Adventure', 4),
('The Lion King', 'Roger Allers', 1994, 8.5, 88, 'Animation', 6),
('Schindler''s List', 'Steven Spielberg', 1993, 8.9, 195, 'Drama', 2),
('Whiplash', 'Damien Chazelle', 2014, 8.5, 106, 'Drama', 3),
('Mad Max: Fury Road', 'George Miller', 2015, 8.1, 120, 'Action', 4);

