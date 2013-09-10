# --- !Ups

--database schema
DROP TABLE treatment_group CASCADE;

DROP SEQUENCE IF EXISTS treatment_group_sequence;

# --- !Downs

--
-- Structure for table treatment_group 
--
CREATE TABLE treatment_group
(
  treatment_group_id bigint NOT NULL,
  date timestamp without time zone,
  maxvalue double precision,
  minvalue double precision,
  name character varying(255),
  CONSTRAINT treatment_group_pkey PRIMARY KEY (treatment_group_id )
);

--
-- Definition for sequence treatment_group_sequence : 
--
CREATE SEQUENCE treatment_group_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;


