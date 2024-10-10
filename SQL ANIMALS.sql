CREATE DATABASE `Human_Friends`;
USE `Human_Friends`;

CREATE TABLE animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    birth_date DATE,
    diet VARCHAR(50),
    type ENUM('pets', 'pack_animals')
);
CREATE TABLE pets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_id INT,
    commands VARCHAR(255),
    FOREIGN KEY (animal_id) REFERENCES animals(id)
);
CREATE TABLE pack_animals (
    id INT AUTO_INCREMENT PRIMARY KEY,
    animal_id INT,
    load_capacity DECIMAL(5, 2),  -- Грузоподъёмность
    FOREIGN KEY (animal_id) REFERENCES animals(id)
);

CREATE TABLE dogs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pet_id INT,
    breed VARCHAR(50),
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);
CREATE TABLE cats (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pet_id INT,
    breed VARCHAR(50),
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);
CREATE TABLE hamsters (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pet_id INT,
    cage_size DECIMAL(3, 1),  -- Размер клетки
    FOREIGN KEY (pet_id) REFERENCES pets(id)
);
CREATE TABLE horses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pack_animal_id INT,
    speed DECIMAL(5, 2),  -- Скорость
    FOREIGN KEY (pack_animal_id) REFERENCES pack_animals(id)
);
CREATE TABLE donkeys (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pack_animal_id INT,
    endurance DECIMAL(5, 2),  -- Выносливость
    FOREIGN KEY (pack_animal_id) REFERENCES pack_animals(id)
);

INSERT INTO animals (name, birth_date, diet, type) VALUES
('Барсик', '2020-05-10', 'Carnivore', 'pets'),
('Шарик', '2019-07-15', 'Carnivore', 'pets'),
('Гектор', '2018-04-22', 'Herbivore', 'pack_animals'),
('Макс', '2021-03-12', 'Herbivore', 'pack_animals');

INSERT INTO pets (animal_id, commands) VALUES
(1, 'sit, stay'),
(2, 'fetch, roll over');

INSERT INTO pack_animals (animal_id, load_capacity) VALUES
(3, 500),
(4, 450);

INSERT INTO dogs (pet_id, breed) VALUES (2, 'Labrador');
INSERT INTO cats (pet_id, breed) VALUES (1, 'Siberian');
INSERT INTO horses (pack_animal_id, speed) VALUES (1, 25.0);
INSERT INTO donkeys (pack_animal_id, endurance) VALUES (2, 10.5);

DELETE FROM animals WHERE type = 'pack_animals' AND name = 'Верблюд';

CREATE TABLE combined_pack_animals AS
SELECT h.id AS id, h.speed AS characteristic, 'Horse' AS type
FROM horses h
UNION ALL
SELECT d.id AS id, d.endurance AS characteristic, 'Donkey' AS type
FROM donkeys d;

CREATE TABLE animals_1_to_3_years AS
SELECT id, name, TIMESTAMPDIFF(MONTH, birth_date, CURDATE()) AS age_in_months
FROM animals
WHERE TIMESTAMPDIFF(YEAR, birth_date, CURDATE()) BETWEEN 1 AND 3;

CREATE TABLE all_animals AS
SELECT a.id, a.name, a.birth_date, a.diet, p.commands, pa.load_capacity, 
       cp.type AS combined_type, cp.characteristic
FROM animals a
LEFT JOIN pets p ON a.id = p.animal_id
LEFT JOIN pack_animals pa ON a.id = pa.animal_id
LEFT JOIN combined_pack_animals cp ON pa.id = cp.id;