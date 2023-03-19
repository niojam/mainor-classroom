CREATE TABLE game
(
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY,
    correct_number INT
);