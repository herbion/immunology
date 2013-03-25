# --- !Ups

--Added one more analysis norm

--
-- Data for analysis_norm table
--
INSERT INTO analysis_norm(analysis_norm_id, description, update_date, analysis_analysis_id, value)
    VALUES (26, 'Норма', '2012-10-23 00:00:00', 7, 0);

--
-- Data for sequence analysis_sequence
--
SELECT setval('analysis_norm_sequence', 26, true);


# --- !Downs

--Drop alergic syndrome data from tables analysis, analysis_norm

DELETE FROM analysis_norm WHERE analysis_norm_id = 26;
