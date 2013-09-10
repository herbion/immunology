# --- !Ups

ALTER TABLE survey_clinical_manifestation ADD COLUMN multiplier double precision DEFAULT 0.0;

# --- !Downs

ALTER TABLE survey_clinical_manifestation DROP COLUMN multiplier;