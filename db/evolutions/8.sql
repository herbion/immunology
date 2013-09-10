# --- !Ups

--Add tables concerning clinical manifestation

--
-- Structure for table clinical_manifestation 
--
CREATE TABLE clinical_manifestation (
    id bigint NOT NULL,
    type integer,
    name varchar(255),
    syndrome_syndrome_id bigint
) WITHOUT OIDS;
--
-- Structure for table clinical_manifestation_norm 
--
CREATE TABLE clinical_manifestation_norm (
    id bigint NOT NULL,
    description varchar(255),
    update_date timestamp without time zone,
    value integer,
    clinicalmanifestation_id bigint
) WITHOUT OIDS;
--
-- Structure for table survey_clinical_manifestation 
--
CREATE TABLE survey_clinical_manifestation (
    id bigint NOT NULL,
    description varchar(255),
    value integer,
    clinicalmanifestationnorm_id bigint,
    survey_survey_id bigint
) WITHOUT OIDS;
--
-- Definition for sequence clinical_manifestation_sequence 
--
CREATE SEQUENCE clinical_manifestation_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence survey_clinical_manifestation_sequence
--
CREATE SEQUENCE survey_clinical_manifestation_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence clinical_manifestation_norm_sequence 
--
CREATE SEQUENCE clinical_manifestation_norm_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

--
-- Definition for index clinical_manifestation_pkey 
--
ALTER TABLE ONLY clinical_manifestation
    ADD CONSTRAINT clinical_manifestation_pkey
    PRIMARY KEY (id);
--
-- Definition for index clinical_manifestation_norm_pkey
--
ALTER TABLE ONLY clinical_manifestation_norm
    ADD CONSTRAINT clinical_manifestation_norm_pkey
    PRIMARY KEY (id);
--
-- Definition for index survey_clinical_manifestation_pkey 
--
ALTER TABLE ONLY survey_clinical_manifestation
    ADD CONSTRAINT survey_clinical_manifestation_pkey
    PRIMARY KEY (id);
    
    --
-- Definition for index fkfd048dfac239a530
--
ALTER TABLE ONLY clinical_manifestation
    ADD CONSTRAINT fkfd048dfac239a530
    FOREIGN KEY (syndrome_syndrome_id) REFERENCES syndrome(syndrome_id);
--
-- Definition for index fkd0d586e12999b016 
--
ALTER TABLE ONLY clinical_manifestation_norm
    ADD CONSTRAINT fkd0d586e12999b016
    FOREIGN KEY (clinicalmanifestation_id) REFERENCES clinical_manifestation(id);
--
-- Definition for index fk1e4c32d48b4facb6 
--
ALTER TABLE ONLY survey_clinical_manifestation
    ADD CONSTRAINT fk1e4c32d48b4facb6
    FOREIGN KEY (clinicalmanifestationnorm_id) REFERENCES clinical_manifestation_norm(id);
--
-- Definition for index fk1e4c32d4288530f9 
--
ALTER TABLE ONLY survey_clinical_manifestation
    ADD CONSTRAINT fk1e4c32d4288530f9
    FOREIGN KEY (survey_survey_id) REFERENCES survey(survey_id)

    
# --- !Downs

--drop tables concerning clinical manifestation

DROP TABLE survey_clinical_manifestation;
DROP TABLE clinical_manifestation_norm;
DROP TABLE clinical_manifestation;

DROP SEQUENCE IF EXISTS clinical_manifestation_sequence;
DROP SEQUENCE IF EXISTS survey_clinical_manifestation_sequence;
DROP SEQUENCE IF EXISTS clinical_manifestation_norm_sequence;

