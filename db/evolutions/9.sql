# --- !Ups

--Add data into tables concerning clinical manifestation

--
-- Data for table clinical_manifestation
--
INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (1, 0, 'Частота дихання', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (2, 0, 'Дихання при аускультації', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (3, 0, 'Хрипи', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (4, 0, 'Форма грудної клітки', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (5, 0, 'Допоміжна мускулатура грудної клітки в акті дихання', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (6, 0, 'Тони серця', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (7, 0, 'Серцеві шуми', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (8, 0, 'Живіт при пальпації', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (9, 0, 'Біль в животі при пальпації', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (10, 0, 'Розміри печінки', 1);

INSERT INTO clinical_manifestation (id, type, name, syndrome_syndrome_id)
VALUES (11, 0, 'С-м Пастернацького', 1);

--
-- Data for table clinical_manifestation_norm
--
INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (1, 'Норма', '2012-10-21 00:00:00', 0, 1);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (2, 'Відхилення', '2012-10-21 00:00:00', 3, 1);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (3, 'Норма', '2012-10-21 00:00:00', 0, 2);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (4, 'Везикулярне', '2012-10-21 00:00:00', 3, 2);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (5, 'Жорстке', '2012-10-21 00:00:00', 3, 2);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (6, 'Ослаблене', '2012-10-21 00:00:00', 3, 2);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (7, 'Не виявлено', '2012-10-21 00:00:00', 0, 3);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (8, 'Сухі', '2012-10-21 00:00:00', 3, 3);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (9, 'Вологі', '2012-10-21 00:00:00', 3, 3);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (10, 'Норма', '2012-10-21 00:00:00', 0, 4);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (11, 'Змінена', '2012-10-21 00:00:00', 3, 4);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (12, 'Ні', '2012-10-21 00:00:00', 0, 5);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (13, 'Так', '2012-10-21 00:00:00', 3, 5);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (14, 'Норма', '2012-10-21 00:00:00', 0, 6);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (15, 'Приглушені', '2012-10-21 00:00:00', 3, 6);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (16, 'Глухі', '2012-10-21 00:00:00', 3, 6);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (17, 'Не виявлено', '2012-10-21 00:00:00', 0, 7);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (18, 'Виявлено', '2012-10-21 00:00:00', 3, 7);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (19, 'Норма', '2012-10-21 00:00:00', 0, 8);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (20, 'Відхилення', '2012-10-21 00:00:00', 3, 8);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (21, 'Ні', '2012-10-21 00:00:00', 0, 9);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (22, 'Так', '2012-10-21 00:00:00', 3, 9);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (23, 'Норма', '2012-10-21 00:00:00', 0, 10);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (24, 'Збільшена', '2012-10-21 00:00:00', 3, 10);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (25, 'Норма', '2012-10-21 00:00:00', 0, 11);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (26, 'Відхилення', '2012-10-21 00:00:00', 3, 11);

--
-- Data for sequence clinical_manifestation_sequence
--
SELECT setval('clinical_manifestation_sequence', 11, true);
--
-- Data for sequence clinical_manifestation_norm_sequence
--
SELECT setval('clinical_manifestation_norm_sequence', 26, true);

    
# --- !Downs

--Drop data from tables concerning clinical manifestation

DELETE FROM clinical_manifestation_norm WHERE id BETWEEN 1 AND 26;

DELETE FROM clinical_manifestation WHERE id BETWEEN 1 AND 11;