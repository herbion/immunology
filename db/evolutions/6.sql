# --- !Ups

--Change column name in table survey_analysis

--
-- Rename column descriptin to description
--
ALTER TABLE survey_analysis RENAME COLUMN descriptin TO description;


# --- !Downs

--
-- Rename column description to descriptin
--
ALTER TABLE survey_analysis RENAME COLUMN description TO descriptin;