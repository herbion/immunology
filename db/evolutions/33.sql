# --- !Ups
DROP TABLE anamnesis CASCADE;

DROP SEQUENCE IF EXISTS anamnesis_sequence;

CREATE TABLE anamnesis
(
  anamnesis_id bigint NOT NULL,
  name character varying(255),
  syndrome_syndrome_id bigint,
  CONSTRAINT anamnesis_pkey PRIMARY KEY (anamnesis_id ),
  CONSTRAINT fk9c29c64dc239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE anamnesis_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE anamnesis_detail
(
  anamnesis_detail_id bigint NOT NULL,
  name character varying(255),
  type integer,
  anamnesis_anamnesis_id bigint,
  CONSTRAINT anamnesis_detail_pkey PRIMARY KEY (anamnesis_detail_id ),
  CONSTRAINT fkcd000e837c291ca8 FOREIGN KEY (anamnesis_anamnesis_id)
      REFERENCES anamnesis (anamnesis_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE anamnesis_detail_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE anamnesis_detail_value
(
  anamnesis_detail_value_id bigint NOT NULL,
  name character varying(255),
  value double precision,
  anamnesisdetail_anamnesis_detail_id bigint,
  CONSTRAINT anamnesis_detail_value_pkey PRIMARY KEY (anamnesis_detail_value_id ),
  CONSTRAINT fk5ed6d4b5565edcd0 FOREIGN KEY (anamnesisdetail_anamnesis_detail_id)
      REFERENCES anamnesis_detail (anamnesis_detail_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE anamnesis_detail_value_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE anamnesis_disease
(
  anamnesis_disease_id bigint NOT NULL,
  name character varying(255),
  type integer,
  syndrome_syndrome_id bigint,
  CONSTRAINT anamnesis_disease_pkey PRIMARY KEY (anamnesis_disease_id ),
  CONSTRAINT fkd9c8c18ac239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE anamnesis_disease_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE anamnesis_disease_detail
(
  anamnesis_disease_detail_id bigint NOT NULL,
  name character varying(255),
  value double precision,
  anamnesisdisease_anamnesis_disease_id bigint,
  CONSTRAINT anamnesis_disease_detail_pkey PRIMARY KEY (anamnesis_disease_detail_id ),
  CONSTRAINT fk294864a62f009d33 FOREIGN KEY (anamnesisdisease_anamnesis_disease_id)
      REFERENCES anamnesis_disease (anamnesis_disease_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE anamnesis_disease_detail_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

CREATE TABLE medicine_card_anamnesis_disease
(
  medicine_card_anamnesis_disease_id bigint NOT NULL,
  amount integer,
  begin_date timestamp without time zone,
  description character varying(10000),
  end_date timestamp without time zone,
  first_manifestation timestamp without time zone,
  value double precision,
  anamnesisdiseasedetail_anamnesis_disease_detail_id bigint,
  medicinecard_medicine_card_id bigint,
  CONSTRAINT medicine_card_anamnesis_disease_pkey PRIMARY KEY (medicine_card_anamnesis_disease_id ),
  CONSTRAINT fkd6a8a9c02f009d33 FOREIGN KEY (anamnesisdiseasedetail_anamnesis_disease_detail_id)
      REFERENCES anamnesis_disease_detail (anamnesis_disease_detail_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fkd6a8a9c0507f0488 FOREIGN KEY (medicinecard_medicine_card_id)
      REFERENCES medicine_card (medicine_card_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE SEQUENCE medicine_card_anamnesis_disease_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;
# --- !Downs
CREATE TABLE anamnesis
(
  anamnesis_id bigint NOT NULL,
  name character varying(255),
  type integer,
  syndrome_syndrome_id bigint,
  value double precision,
  CONSTRAINT anamnesis_pkey PRIMARY KEY (anamnesis_id ),
  CONSTRAINT fk9c29c64dc239a530 FOREIGN KEY (syndrome_syndrome_id)
      REFERENCES syndrome (syndrome_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);

DROP TABLE anamnesis CASCADE;
DROP TABLE anamnesis_detail CASCADE;
DROP TABLE anamnesis_detail_value CASCADE;
DROP TABLE anamnesis_disease CASCADE;
DROP TABLE anamnesis_disease_detail CASCADE;
DROP TABLE medicine_card_anamnesis_disease CASCADE;

DROP SEQUENCE IF EXISTS anamnesis_sequence;
DROP SEQUENCE IF EXISTS anamnesis_detail_sequence;
DROP SEQUENCE IF EXISTS anamnesis_detail_value_sequence;
DROP SEQUENCE IF EXISTS anamnesis_disease_sequence;
DROP SEQUENCE IF EXISTS anamnesis_disease_detail_sequence;
DROP SEQUENCE IF EXISTS medicine_card_anamnesis_disease_sequence;