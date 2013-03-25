# --- !Ups
DROP TABLE clinical_manifestation CASCADE;

DROP SEQUENCE IF EXISTS clinical_manifestation_sequence;

CREATE TABLE clinical_manifestation_complaint
(
  clinical_manifestation_complaint_id bigint NOT NULL,
  name character varying(255),
  syndrome_syndrome_id bigint,
  CONSTRAINT clinical_manifestation_complaint_pkey PRIMARY KEY (clinical_manifestation_complaint_id ),
  CONSTRAINT fk396ed4a6c239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE clinical_manifestation
(
  id bigint NOT NULL,
  type integer,
  name character varying(255),
  clinicalmanifestationcomplaint_clinical_manifestation_complaint bigint,
  CONSTRAINT clinical_manifestation_pkey PRIMARY KEY (id ),
  CONSTRAINT fkfd048dfa35d8a6e9 FOREIGN KEY (clinicalmanifestationcomplaint_clinical_manifestation_complaint)
      REFERENCES clinical_manifestation_complaint (clinical_manifestation_complaint_id) 
      MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE clinical_manifestation_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE SEQUENCE clinical_manifestation_complaint_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
# --- !Downs
CREATE TABLE clinical_manifestation
(
  id bigint NOT NULL,
  type integer,
  name character varying(255),
  syndrome_syndrome_id bigint,
  CONSTRAINT clinical_manifestation_pkey PRIMARY KEY (id ),
  CONSTRAINT fkfd048dfac239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE clinical_manifestation_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

DROP TABLE clinical_manifestation_complaint CASCADE;
DROP TABLE clinical_manifestation CASCADE;

DROP SEQUENCE IF EXISTS clinical_manifestation_complaint_sequence;
DROP SEQUENCE IF EXISTS clinical_manifestation_sequence;