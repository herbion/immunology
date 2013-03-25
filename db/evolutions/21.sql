# --- !Ups

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (12, 'Аналіз крові на триптазу', 1, 1);


INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (27, 'Норма', 10, 0, '2012-11-05 00:00:00', 12, 0, 'мкг/л'),
		(28, 'Відхилення', NULL, 10, '2012-11-05 00:00:00', 12, 3, 'мкг/л');

INSERT INTO medicationdetail_insertion (medication_detail_id, insertion_id)
VALUES (1, 11), (1,12), (1,13),(2, 11), (2,12), (2,13),(3, 11), (3,12), 
		(3,13),(5, 11), (5,12), (5,13),(6, 11), 
		(6,12), (6,13),(7, 11), (7,12), (7,13),(8, 11), (8,12), (8,13),
		(9, 11), (9,12), (9,13),(28, 11), (28,12), (28,13),(29, 11), 
		(29,12), (29,13),(30, 11), (30,12), (30,13),(31, 11), (31,12), 
		(31,13),(32, 11), (32,12), (32,13),(69,1),(69,2),(70,1),(70,2),
		(71,2),(72,2),(72,3),(73,2),(73,3),(74,5),(74,6),(74,7),(74,8),
		(74,9),(74,10);

--
-- Data for sequence public.analysis_norm_sequence (OID = 176970)
--
SELECT pg_catalog.setval('analysis_norm_sequence', 30, true);
--
-- Data for sequence public.analysis_sequence (OID = 176972)
--
SELECT pg_catalog.setval('analysis_sequence', 13, true);

# --- !Downs

DELETE FROM analysis WHERE analysis_id BETWEEN 12 AND 13;

DELETE FROM analysis_norm WHERE analysis_norm_id BETWEEN 27 AND 30;

DELETE FROM medicationdetail_insertion WHERE medication_detail_id BETWEEN 1 AND 9;

DELETE FROM medicationdetail_insertion WHERE medication_detail_id BETWEEN 28 AND 32;

DELETE FROM medicationdetail_insertion WHERE medication_detail_id BETWEEN 69 AND 74;
