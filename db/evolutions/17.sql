# --- !Ups

--database schema

--
-- Structure for table treatmenttype : 
--
CREATE TABLE treatmenttype
(
  treatment_type_id bigint NOT NULL,
  name character varying(255),
  syndrome_syndrome_id bigint,
  CONSTRAINT treatmenttype_pkey PRIMARY KEY (treatment_type_id ),
  CONSTRAINT fkfc397878c239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Structure for table medication : 
--
CREATE TABLE medication
(
  medication_id bigint NOT NULL,
  name character varying(255),
  treatmenttype_treatment_type_id bigint,
  CONSTRAINT medication_pkey PRIMARY KEY (medication_id ),
  CONSTRAINT fk7725cacfa887075a FOREIGN KEY (treatmenttype_treatment_type_id)
      REFERENCES treatmenttype (treatment_type_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Structure for table medication_detail : 
--
CREATE TABLE medication_detail
(
  medication_detail_id bigint NOT NULL,
  name character varying(255),
  medication_medication_id bigint,
  CONSTRAINT medication_detail_pkey PRIMARY KEY (medication_detail_id ),
  CONSTRAINT fk239053c1a4cf1c0e FOREIGN KEY (medication_medication_id)
      REFERENCES medication (medication_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Structure for table insertion : 
--
CREATE TABLE insertion
(
  insertion_id bigint NOT NULL,
  name character varying(255)
);
ALTER TABLE ONLY insertion
    ADD CONSTRAINT insertion_pkey
    PRIMARY KEY (insertion_id);
--
-- Structure for table medicationdetail_insertion : 
--
CREATE TABLE medicationdetail_insertion
(
  medication_detail_id bigint NOT NULL,
  insertion_id bigint NOT NULL,
  CONSTRAINT fk6ecfe130e20ad17d FOREIGN KEY (medication_detail_id)
      REFERENCES medication_detail (medication_detail_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk6ecfe130f2fa0b6 FOREIGN KEY (insertion_id)
      REFERENCES insertion (insertion_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
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
-- Structure for table survey_treatment 
--
CREATE TABLE survey_treatment
(
  survey_treatment_id bigint NOT NULL,
  medicationdetail_medication_detail_id bigint,
  descriptin varchar(255),
  survey_survey_id bigint,
  treatmentgroup_treatment_group_id bigint,
  CONSTRAINT survey_treatment_pkey PRIMARY KEY (survey_treatment_id ),
  CONSTRAINT fkf7a031d32103cc7c FOREIGN KEY (medicationdetail_medication_detail_id)
      REFERENCES medication_detail (medication_detail_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fkf7a031d3288530f9 FOREIGN KEY (survey_survey_id)
      REFERENCES survey (survey_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fkf7a031d3fca8e205 FOREIGN KEY (treatmentgroup_treatment_group_id)
      REFERENCES treatment_group (treatment_group_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Definition for sequence treatment_type_sequence : 
--
CREATE SEQUENCE treatment_type_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
--
-- Definition for sequence medication_sequence : 
--
CREATE SEQUENCE medication_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

--
-- Definition for sequence medication_detail_sequence : 
--
CREATE SEQUENCE medication_detail_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
--
-- Definition for sequence survey_treatment_sequence : 
--
CREATE SEQUENCE survey_treatment_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

--
-- Definition for sequence treatment_group_sequence : 
--
CREATE SEQUENCE treatment_group_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

--
-- Definition for sequence insertion_sequence : 
--
CREATE SEQUENCE insertion_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
# --- !Downs

--drop database schema
DROP TABLE treatmenttype;
DROP TABLE medication;
DROP TABLE medication_detail;
DROP TABLE treatment_group;
DROP TABLE survey_treatment;
DROP TABLE insertion;
DROP TABLE medicationdetail_insertion;


DROP SEQUENCE IF EXISTS treatment_type_sequence;
DROP SEQUENCE IF EXISTS medication_sequence;
DROP SEQUENCE IF EXISTS medication_detail_sequence;
DROP SEQUENCE IF EXISTS survey_treatment_sequence;
DROP SEQUENCE IF EXISTS treatment_group_sequence;
DROP SEQUENCE IF EXISTS insertion_sequence;