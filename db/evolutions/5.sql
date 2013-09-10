# --- !Ups

--Added new columns to analysis_norm table

--
-- Column "value"
--
ALTER TABLE analysis_norm ADD COLUMN value integer DEFAULT 0;
--
-- Column "unit"
--
ALTER TABLE analysis_norm ADD COLUMN unit varchar(30);


# --- !Downs

--drop new columns from analysis_norm table

ALTER TABLE analysis_norm DROP COLUMN unit;

ALTER TABLE analysis_norm DROP COLUMN value;