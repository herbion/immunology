# --- !Ups

-- Setting right order of analysis norms for correct displaying 
UPDATE analysis_norm SET description='Не виявлено', value=0 WHERE analysis_norm_id = 20;

UPDATE analysis_norm SET description='Виявлено' , value=3 WHERE analysis_norm_id = 21;

UPDATE analysis_norm SET description='Не виявлено', value=0 WHERE analysis_norm_id = 22;

UPDATE analysis_norm SET description='Виявлено' , value=3 WHERE analysis_norm_id = 23;

UPDATE analysis_norm SET description='Не виявлено' , value=0 WHERE analysis_norm_id = 24;

UPDATE analysis_norm SET description='Виявлено' , value=3 WHERE analysis_norm_id = 25;

# --- !Downs

DELETE FROM analysis_norm WHERE analysis_norm_id BETWEEN 20 AND 25;