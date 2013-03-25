# --- !Ups

--Added alergic syndrome data into tables analysis, analysis_norm

--
-- Data for table analysis
--
INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (3, 'Еозинофілія', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (4, 'Еозинофіли в секретах та відбитках слизових (носу, ока тощо)', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (5, 'Загальний IgE', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (6, 'Специфічні IgE (харчові, інгаляційні, інсектні)', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (7, 'Дослідження функції зовнішнього дихання: об''єм форсованого видиху за першу секунду', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (9, 'Біопсія тканин', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (10, 'Аналіз калу на яйця гельмінтів', 1, 1);

INSERT INTO analysis (analysis_id, name, type, syndrome_syndrome_id)
VALUES (11, 'Аналіз крові на специфічні антитіла до гельмінтів і паразитів', 1, 1);



--
-- Data for table analysis_norm
--
INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (2, 'Норма', 0.6, NULL, '2012-10-15 00:00:00', 3, 0, 'Г/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (3, 'Легка', 1.5, 0.6, '2012-10-15 00:00:00', 3, 1, 'Г/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (4, 'Середня', 5, 1.5, '2012-10-15 00:00:00', 3, 2, 'Г/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (5, 'Тяжка', NULL, 5, '2012-10-15 00:00:00', 3, 3, 'Г/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (6, 'Норма', 4, NULL, '2012-10-15 00:00:00', 4, 0, '%');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (7, 'Відхилення', NULL, 4, '2012-10-15 00:00:00', 4, 3, '%');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (8, 'Відхилення', 10, NULL, '2012-10-15 00:00:00', 5, 3, 'МЕ/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (9, 'Норма', 100, 10, '2012-10-15 00:00:00', 5, 0, 'МЕ/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (10, 'Відхилення', NULL, 100, '2012-10-15 00:00:00', 5, 3, 'МЕ/л');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (11, 'ОФВ1', 20, NULL, '2012-10-15 00:00:00', 7, 1, '%');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (12, 'ОФВ1', 30, 20, '2012-10-15 00:00:00', 7, 2, '%');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (13, 'ОФВ1', NULL, 30, '2012-10-15 00:00:00', 7, 3, '%');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (18, 'Норма', NULL, NULL, '2012-10-15 00:00:00', 9, 0, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (19, 'Еозинофільна інфільтрація', NULL, NULL, '2012-10-15 00:00:00', 9, 3, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (20, 'Виявлено', NULL, NULL, '2012-10-16 00:00:00', 6, 3, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (21, 'Не виявлено', NULL, NULL, '2012-10-16 00:00:00', 6, 0, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (22, 'Виявлено', NULL, NULL, '2012-10-16 00:00:00', 10, 3, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (23, 'Не виявлено', NULL, NULL, '2012-10-16 00:00:00', 10, 0, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (24, 'Виявлено', NULL, NULL, '2012-10-16 00:00:00', 11, 3, '');

INSERT INTO analysis_norm (analysis_norm_id, description, max_value, min_value, update_date, analysis_analysis_id, value, unit)
VALUES (25, 'Не виявлено', NULL, NULL, '2012-10-16 00:00:00', 11, 0, '');

--
-- Data for sequence analysis_norm_sequence
--
SELECT setval('analysis_norm_sequence', 25, true);

--
-- Data for sequence analysis_sequence
--
SELECT setval('analysis_sequence', 11, true);


# --- !Downs

--Drop alergic syndrome data from tables analysis, analysis_norm

DELETE FROM analysis WHERE analysis_id BETWEEN 3 AND 11;

DELETE FROM analysis_norm WHERE analysis_norm_id BETWEEN 2 AND 25;