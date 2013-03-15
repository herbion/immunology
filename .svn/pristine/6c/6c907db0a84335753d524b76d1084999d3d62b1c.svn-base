# --- !Ups
--database schema
--
-- Structure for table anamnesis_detail : 
--
CREATE TABLE analysis_subtype
(
  analysis_subtype_id bigint NOT NULL,
  name character varying(255),
  analysis_id bigint,
  CONSTRAINT analysis_subtype_pkey PRIMARY KEY (analysis_subtype_id ),
  CONSTRAINT fkfc397878c239a531 FOREIGN KEY (analysis_id)
      REFERENCES analysis (analysis_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Structure for table anamnesis_detail : 
--
CREATE TABLE analysis_detail
(
  analysis_detail_id bigint NOT NULL,
  name character varying(255),
  analysis_subtype_id bigint,
  CONSTRAINT analysis_detail_pkey PRIMARY KEY (analysis_detail_id ),
  CONSTRAINT fkfc397878c239a531 FOREIGN KEY (analysis_subtype_id)
      REFERENCES analysis_subtype (analysis_subtype_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Definition for sequence anamnesis_detail_sequence : 
--
CREATE SEQUENCE analysis_subtype_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
--
-- Definition for sequence anamnesis_detail_sequence : 
--
CREATE SEQUENCE analysis_detail_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
# --- !Downs
DROP TABLE analysis_subtype CASCADE;
DROP TABLE analysis_detail CASCADE;

DROP SEQUENCE IF EXISTS analysis_subtype_sequence;
DROP SEQUENCE IF EXISTS analysis_detail_sequence;