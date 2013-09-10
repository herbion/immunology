# --- !Ups
INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES 	(15, 'Біохімічний аналіз крові', 1, 1),
		(16, 'Кріоглобуліни', 1, 1),(17, 'Холодові проби', 1, 1),(18, 'Компоненти коліплементу', 1, 1),
		(19, 'Аплікаційні тести', 1, 1),(20, 'Інструментальні підтверджуючі д/з дослідження', 2, 1),
		(21, 'Підтверджуючі бактеріологічні дослідження', 2, 1), 
		(22, 'Підтверджуючий гісто-цитологічний аналіз біоптату', 2, 1);
		
SELECT setval('analysis_sequence', 22, true);

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES	(31, 'Норма', NULL, NULL, '2012-10-15 00:00:00', 15, 0, ''),
		(32, 'Відхилення', NULL, NULL, '2012-10-15 00:00:00', 15, 3, ''),
		(33, 'Норма', NULL, NULL, '2012-10-15 00:00:00', 16, 0, ''),
		(34, 'Відхилення', NULL, NULL, '2012-10-15 00:00:00', 16, 3, ''),
		(35, 'Норма', NULL, NULL, '2012-10-15 00:00:00', 17, 0, ''),
		(36, 'Відхилення', NULL, NULL, '2012-10-15 00:00:00', 17, 3, ''),
		(37, 'Норма', NULL, NULL, '2012-10-15 00:00:00', 18, 0, ''),
		(38, 'Відхилення', NULL, NULL, '2012-10-15 00:00:00', 18, 3, ''),
		(39, 'Норма', NULL, NULL, '2012-10-15 00:00:00', 19, 0, ''),
		(40, 'Відхилення', NULL, NULL, '2012-10-15 00:00:00', 19, 3, ''),
		(41, '', NULL, NULL, '2012-10-15 00:00:00', 20, 3, ''),
		(42, '', NULL, NULL, '2012-10-15 00:00:00', 21, 3, ''),
		(43, '', NULL, NULL, '2012-10-15 00:00:00', 22, 3, '');

SELECT setval('analysis_norm_sequence', 43, true);

DELETE FROM complaint WHERE complaint_id IN (3, 8, 16, 18, 26, 33, 39, 46, 52, 222);

INSERT INTO complaint(
            complaint_id, name, complainttype_complaint_type_id)
    VALUES (223,'Кількість денних приступів ядухи на тиждень', 3),
    		(224,'Кількість денних приступів ядухи на місяць', 3),
    		(225,'Кількість нічних приступів ядухи на тиждень', 3),
    		(226,'Кількість нічних приступів ядухи на місяць', 3);
 
SELECT setval('complaint_sequence', 226, true);

DROP TABLE nosology CASCADE;
DROP SEQUENCE nosology_sequence;
DROP TABLE nosology_type CASCADE;
DROP SEQUENCE nosology_type_sequence;
# --- !Downs
DELETE FROM analysis WHERE analysis_id BETWEEN 15 AND 22;

SELECT setval('analysis_sequence', 13, true);

DELETE FROM analysis_norm WHERE analysis_norm_id BETWEEN 31 AND 43;

SELECT setval('analysis_norm_sequence', 30, true);

INSERT INTO complaint(complaint_id, name, complainttype_complaint_type_id)
    VALUES (3,'Інші', 1),(8,'Інші', 1),(16,'Інші', 1),(18,'Інші', 1),(26,'Інші', 1),(33,'Інші', 1),(39,'Інші', 1),
    		(46,'Інші', 1),(52,'Інші', 1),(222,'Приступи ядухи', 3);
SELECT setval('complaint_sequence', 222, true);

CREATE TABLE nosology
(
  nosology_id bigint NOT NULL,
  name character varying(255),
  nosologytype_nosology_type_id bigint,
  CONSTRAINT nosology_pkey PRIMARY KEY (nosology_id ),
  CONSTRAINT fk5d213f121187fd36 FOREIGN KEY (nosologytype_nosology_type_id)
      REFERENCES nosology_type (nosology_type_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE nosology_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE nosology_type
(
  nosology_type_id bigint NOT NULL,
  name character varying(255),
  syndrome_syndrome_id bigint,
  CONSTRAINT nosology_type_pkey PRIMARY KEY (nosology_type_id ),
  CONSTRAINT fk54f6a447c239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE nosology_type_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;