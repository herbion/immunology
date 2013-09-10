# --- !Ups

DROP TABLE anamnesis_detail CASCADE;

DROP SEQUENCE IF EXISTS anamnesis_detail_sequence;

# --- !Downs
--
-- Structure for table anamnesis_detail : 
--
CREATE TABLE anamnesis_detail
(
  anamnesis_detail_id bigint NOT NULL,
  name character varying(255),
  anamnesis_id bigint,
  CONSTRAINT anamnesis_detail_pkey PRIMARY KEY (anamnesis_detail_id ),
  CONSTRAINT fkfc397878c239a531 FOREIGN KEY (anamnesis_id)
      REFERENCES anamnesis (anamnesis_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

--
-- Definition for sequence anamnesis_detail_sequence : 
--
CREATE SEQUENCE anamnesis_detail_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;


