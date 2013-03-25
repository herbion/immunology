# --- !Ups

--Add column into table survey

--
-- Add column syndrome_syndrome_id
--
ALTER TABLE survey ADD COLUMN syndrome_syndrome_id bigint NOT NULL;


# --- !Downs

--
--Drop column syndrome_syndrome_id
--
ALTER TABLE survey DROP COLUMN IF EXISTS syndrome_syndrome_id;