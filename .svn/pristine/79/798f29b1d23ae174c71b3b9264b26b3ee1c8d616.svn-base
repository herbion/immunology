# --- !Ups
CREATE TABLE nosology
(
  nosology_id bigint NOT NULL,
  name character varying(255),
  syndrome_syndrome_id bigint,
  CONSTRAINT nosology_pkey PRIMARY KEY (nosology_id ),
  CONSTRAINT fk5d213f12c239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE nosology_analysis
(
  nosology_analysis_id bigint NOT NULL,
  analysis_id bigint,
  multyplier double precision,
  nosology_nosology_id bigint,
  CONSTRAINT nosology_analysis_pkey PRIMARY KEY (nosology_analysis_id ),
  CONSTRAINT fke054f9692ae5d5f1 FOREIGN KEY (nosology_nosology_id)
      REFERENCES nosology (nosology_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE nosology_clinical_manifestation
(
  nosology_clinical_manifestation_id bigint NOT NULL,
  clinical_manifestation_id integer,
  multyplier double precision,
  nosology_nosology_id bigint,
  CONSTRAINT nosology_clinical_manifestation_pkey PRIMARY KEY (nosology_clinical_manifestation_id ),
  CONSTRAINT fkd7059c72ae5d5f1 FOREIGN KEY (nosology_nosology_id)
      REFERENCES nosology (nosology_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE nosology_complaint_type
(
  nosology_complaint_type_id bigint NOT NULL,
  complaint_type_id bigint,
  multyplier double precision,
  nosology_nosology_id bigint,
  CONSTRAINT nosology_complaint_type_pkey PRIMARY KEY (nosology_complaint_type_id ),
  CONSTRAINT fk43e3671b2ae5d5f1 FOREIGN KEY (nosology_nosology_id)
      REFERENCES nosology (nosology_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE nosology_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
CREATE SEQUENCE nosology_analysis_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE SEQUENCE nosology_clinical_manifestation_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
  
CREATE SEQUENCE nosology_complaint_type_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

ALTER TABLE clinical_manifestation_complaint ADD COLUMN multyplier double precision DEFAULT 0.0;
ALTER TABLE analysis ADD COLUMN multyplier double precision DEFAULT 0.0;
# --- !Downs
DROP TABLE nosology CASCADE;
DROP TABLE nosology_analysis CASCADE;
DROP TABLE nosology_clinical_manifestation CASCADE;
DROP TABLE nosology_complaint_type CASCADE;

DROP SEQUENCE nosology_sequence;
DROP SEQUENCE nosology_analysis_sequence;
DROP SEQUENCE nosology_clinical_manifestation_sequence;
DROP SEQUENCE nosology_complaint_type_sequence;

ALTER TABLE clinical_manifestation_complaint DROP COLUMN multyplier;
ALTER TABLE analysis DROP COLUMN multyplier;