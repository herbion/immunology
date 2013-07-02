# --- !Ups
ALTER TABLE anamnesis ADD COLUMN value double precision;
ALTER TABLE medicine_card_anamnesis ADD COLUMN value double precision;
ALTER TABLE survey_analysis DROP COLUMN IF EXISTS analysis_analysis_id;

# --- !Downs
ALTER TABLE anamnesis DROP COLUMN value;
ALTER TABLE medicine_card_anamnesis DROP COLUMN value
ALTER TABLE survey_analysis ADD COLUMN analysis_analysis_id integer;
