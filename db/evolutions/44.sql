# --- !Ups

ALTER TABLE survey_analysis ADD COLUMN multiplier double precision DEFAULT 0.0;

# --- !Downs

ALTER TABLE survey_analysis DROP COLUMN multiplier;