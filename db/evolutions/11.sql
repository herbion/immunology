# --- !Ups

--Add data into tables concerning anamnesis

--
-- Data for table anamnesis
--
INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (1, 'Хворі на алергію брат/сестра', 0, 1, 1.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (2, 'Хвора на алергію мати', 0, 1, 2.5);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (3, 'Хворий на алергію батько', 0, 1, 2.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (4, 'Хворі на алергію інші родичі', 0, 1, 1.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (5, 'Ефективність застосування антигістамінних препаратів', 0, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (6, 'Алергічні реакції на побутові фактори', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (7, 'Алергічні реакції на рослинні фактори', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (8, 'Алергічні реакції на харчові продукти', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (9, 'Алергічні реакції на укуси комах', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (10, 'Алергічні реакції на медикаментозні', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (11, 'Алергічні реакції на грибкові', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (12, 'Алергічні реакції на медикаменти', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (13, 'Алергічні реакції на косметичні засоби', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (14, 'Алергічні реакції на фізичні фактори', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (15, 'Алергічні реакції на хімічні фактори', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (16, 'Алергічні реакції на інші збудники', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (17, 'Умови проживання', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (18, 'Умови праці', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (19, 'Сезонність', 1, 1, 3.0);

INSERT INTO anamnesis (anamnesis_id, name, type, syndrome_syndrome_id, value)
VALUES (20, 'Частота загострень протягом року', 1, 1, 3.0);

--
-- Data for sequence anamnesis_sequence
--
SELECT setval('anamnesis_sequence', 22, true);

    
# --- !Downs

--Drop data from tables concerning clinical manifestation

DELETE FROM anamnesis WHERE id BETWEEN 1 AND 20;
