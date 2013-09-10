# --- !Ups

ALTER TABLE survey_treatment ADD COLUMN dose varchar(255);

ALTER TABLE survey_treatment ADD COLUMN multiplicity varchar(255);

# --- !Downs

ALTER TABLE survey_treatment DROP COLUMN multiplicity;

ALTER TABLE survey_treatment DROP COLUMN dose;