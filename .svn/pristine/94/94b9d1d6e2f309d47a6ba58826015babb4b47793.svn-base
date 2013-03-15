# --- !Ups

--database schema

--
-- Structure for table analysis (OID = 29527) : 
--
CREATE TABLE analysis (
    analysis_id bigint NOT NULL,
    name varchar(255),
    type integer,
    syndrome_syndrome_id bigint
) WITHOUT OIDS;
--
-- Structure for table analysis_norm (OID = 29532) : 
--
CREATE TABLE analysis_norm (
    analysis_norm_id bigint NOT NULL,
    description varchar(255),
    max_value double precision,
    min_value double precision,
    update_date timestamp without time zone,
    analysis_analysis_id bigint
) WITHOUT OIDS;
--
-- Structure for table anamnesis (OID = 29537) : 
--
CREATE TABLE anamnesis (
    anamnesis_id bigint NOT NULL,
    name varchar(255),
    type integer,
    syndrome_syndrome_id bigint
) WITHOUT OIDS;
--
-- Structure for table complaint (OID = 29542) : 
--
CREATE TABLE complaint (
    complaint_id bigint NOT NULL,
    name varchar(255),
    complainttype_complaint_type_id bigint
) WITHOUT OIDS;
--
-- Structure for table complaint_detail (OID = 29547) : 
--
CREATE TABLE complaint_detail (
    complaint_detail_id bigint NOT NULL,
    name varchar(255),
    complaint_complaint_id bigint
) WITHOUT OIDS;
--
-- Structure for table complaint_type (OID = 29552) : 
--
CREATE TABLE complaint_type (
    complaint_type_id bigint NOT NULL,
    name varchar(255),
    multyplier double precision,
    syndrome_syndrome_id bigint
) WITHOUT OIDS;
--
-- Structure for table medicine_card (OID = 29557) : 
--
CREATE TABLE medicine_card (
    medicine_card_id bigint NOT NULL,
    creation_date timestamp without time zone,
    other_info varchar(10000)
) WITHOUT OIDS;
--
-- Structure for table medicine_card_anamnesis (OID = 29565) : 
--
CREATE TABLE medicine_card_anamnesis (
    medicine_card_anamnesis_id bigint NOT NULL,
    amount integer,
    begin_date timestamp without time zone,
    description varchar(10000),
    end_date timestamp without time zone,
    first_manifestation timestamp without time zone,
    anamnesis_anamnesis_id bigint,
    medicinecard_medicine_card_id bigint
) WITHOUT OIDS;
--
-- Structure for table medicine_card_nosology (OID = 29573) : 
--
CREATE TABLE medicine_card_nosology (
    medicine_card_nosology_id bigint NOT NULL,
    active boolean,
    begin_date timestamp without time zone,
    description varchar(10000),
    end_date timestamp without time zone,
    medicinecard_medicine_card_id bigint,
    nosology_nosology_id bigint
) WITHOUT OIDS;
--
-- Structure for table nosology (OID = 29581) : 
--
CREATE TABLE nosology (
    nosology_id bigint NOT NULL,
    name varchar(255),
    nosologytype_nosology_type_id bigint
) WITHOUT OIDS;
--
-- Structure for table nosology_type (OID = 29586) : 
--
CREATE TABLE nosology_type (
    nosology_type_id bigint NOT NULL,
    name varchar(255),
    syndrome_syndrome_id bigint
) WITHOUT OIDS;
--
-- Structure for table patient (OID = 29591) : 
--
CREATE TABLE patient (
    patient_id bigint NOT NULL,
    birthday timestamp without time zone,
    city varchar(255),
    country varchar(255),
    district varchar(255),
    first_name varchar(255),
    flat integer,
    gender integer,
    house varchar(255),
    last_name varchar(255),
    middle_name varchar(255),
    region varchar(255),
    street varchar(255),
    medicinecard_medicine_card_id bigint
) WITHOUT OIDS;
--
-- Structure for table role (OID = 29599) : 
--
CREATE TABLE role (
    role_id bigint NOT NULL,
    role_name varchar(255)
) WITHOUT OIDS;
--
-- Structure for table survey (OID = 29604) : 
--
CREATE TABLE survey (
    survey_id bigint NOT NULL,
    difficulty_degree integer,
    insufficiency_degree integer,
    date timestamp without time zone,
    medicinecard_medicine_card_id bigint,
    user_user_id bigint
) WITHOUT OIDS;
--
-- Structure for table survey_analysis (OID = 29609) : 
--
CREATE TABLE survey_analysis (
    survey_analysis_id bigint NOT NULL,
    descriptin varchar(255),
    value integer,
    analysis_analysis_id bigint,
    survey_survey_id bigint
) WITHOUT OIDS;
--
-- Structure for table survey_answer (OID = 29614) : 
--
CREATE TABLE survey_answer (
    survey_answer_id bigint NOT NULL,
    description varchar(255),
    value integer,
    complaint_complaint_id bigint,
    survey_survey_id bigint
) WITHOUT OIDS;
--
-- Structure for table survey_answer_complaint_detail (OID = 29619) : 
--
CREATE TABLE survey_answer_complaint_detail (
    survey_answer_id bigint NOT NULL,
    complaint_detail_id bigint NOT NULL
) WITHOUT OIDS;
--
-- Structure for table syndrome (OID = 29624) : 
--
CREATE TABLE syndrome (
    syndrome_id bigint NOT NULL,
    name varchar(255)
) WITHOUT OIDS;
--
-- Structure for table users (OID = 29629) : 
--
CREATE TABLE users (
    user_id bigint NOT NULL,
    first_name varchar(255),
    last_name varchar(255),
    login varchar(255),
    middle_name varchar(255),
    password varchar(255),
    post varchar(255)
) WITHOUT OIDS;
--
-- Structure for table users_role (OID = 29639) : 
--
CREATE TABLE users_role (
    user_id bigint NOT NULL,
    role_id bigint NOT NULL
) WITHOUT OIDS;

--
-- Definition for sequence analysis_norm_sequence (OID = 32166) : 
--
CREATE SEQUENCE analysis_norm_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence analysis_sequence (OID = 32168) : 
--
CREATE SEQUENCE analysis_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence anamnesis_sequence (OID = 32170) : 
--
CREATE SEQUENCE anamnesis_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence complaint_detail_sequence (OID = 32172) : 
--
CREATE SEQUENCE complaint_detail_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence complaint_sequence (OID = 32174) : 
--
CREATE SEQUENCE complaint_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence complaint_type_sequence (OID = 32176) : 
--
CREATE SEQUENCE complaint_type_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence medicine_card_anamnesis_sequence (OID = 32178) : 
--
CREATE SEQUENCE medicine_card_anamnesis_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence medicine_card_nosology_sequence (OID = 32180) : 
--
CREATE SEQUENCE medicine_card_nosology_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence medicine_card_sequence (OID = 32182) : 
--
CREATE SEQUENCE medicine_card_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence nosology_sequence (OID = 32184) : 
--
CREATE SEQUENCE nosology_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence nosology_type_sequence (OID = 32186) : 
--
CREATE SEQUENCE nosology_type_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence patient_sequence (OID = 32188) : 
--
CREATE SEQUENCE patient_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence role_sequence (OID = 32190) : 
--
CREATE SEQUENCE role_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence survey_analysis_sequence (OID = 32192) : 
--
CREATE SEQUENCE survey_analysis_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence survey_answer_sequence (OID = 32194) : 
--
CREATE SEQUENCE survey_answer_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence survey_sequence (OID = 32196) : 
--
CREATE SEQUENCE survey_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence syndrome_sequence (OID = 32198) : 
--
CREATE SEQUENCE syndrome_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;
--
-- Definition for sequence users_sequence (OID = 32200) : 
--
CREATE SEQUENCE users_sequence
    START WITH 1
    INCREMENT BY 1
    NO MAXVALUE
    NO MINVALUE
    CACHE 1;

--
-- Definition for index analysis_pkey (OID = 29530) : 
--
ALTER TABLE ONLY analysis
    ADD CONSTRAINT analysis_pkey
    PRIMARY KEY (analysis_id);
--
-- Definition for index analysis_norm_pkey (OID = 29535) : 
--
ALTER TABLE ONLY analysis_norm
    ADD CONSTRAINT analysis_norm_pkey
    PRIMARY KEY (analysis_norm_id);
--
-- Definition for index anamnesis_pkey (OID = 29540) : 
--
ALTER TABLE ONLY anamnesis
    ADD CONSTRAINT anamnesis_pkey
    PRIMARY KEY (anamnesis_id);
--
-- Definition for index complaint_pkey (OID = 29545) : 
--
ALTER TABLE ONLY complaint
    ADD CONSTRAINT complaint_pkey
    PRIMARY KEY (complaint_id);
--
-- Definition for index complaint_detail_pkey (OID = 29550) : 
--
ALTER TABLE ONLY complaint_detail
    ADD CONSTRAINT complaint_detail_pkey
    PRIMARY KEY (complaint_detail_id);
--
-- Definition for index complaint_type_pkey (OID = 29555) : 
--
ALTER TABLE ONLY complaint_type
    ADD CONSTRAINT complaint_type_pkey
    PRIMARY KEY (complaint_type_id);
--
-- Definition for index medicine_card_pkey (OID = 29563) : 
--
ALTER TABLE ONLY medicine_card
    ADD CONSTRAINT medicine_card_pkey
    PRIMARY KEY (medicine_card_id);
--
-- Definition for index medicine_card_anamnesis_pkey (OID = 29571) : 
--
ALTER TABLE ONLY medicine_card_anamnesis
    ADD CONSTRAINT medicine_card_anamnesis_pkey
    PRIMARY KEY (medicine_card_anamnesis_id);
--
-- Definition for index medicine_card_nosology_pkey (OID = 29579) : 
--
ALTER TABLE ONLY medicine_card_nosology
    ADD CONSTRAINT medicine_card_nosology_pkey
    PRIMARY KEY (medicine_card_nosology_id);
--
-- Definition for index nosology_pkey (OID = 29584) : 
--
ALTER TABLE ONLY nosology
    ADD CONSTRAINT nosology_pkey
    PRIMARY KEY (nosology_id);
--
-- Definition for index nosology_type_pkey (OID = 29589) : 
--
ALTER TABLE ONLY nosology_type
    ADD CONSTRAINT nosology_type_pkey
    PRIMARY KEY (nosology_type_id);
--
-- Definition for index patient_pkey (OID = 29597) : 
--
ALTER TABLE ONLY patient
    ADD CONSTRAINT patient_pkey
    PRIMARY KEY (patient_id);
--
-- Definition for index role_pkey (OID = 29602) : 
--
ALTER TABLE ONLY role
    ADD CONSTRAINT role_pkey
    PRIMARY KEY (role_id);
--
-- Definition for index survey_pkey (OID = 29607) : 
--
ALTER TABLE ONLY survey
    ADD CONSTRAINT survey_pkey
    PRIMARY KEY (survey_id);
--
-- Definition for index survey_analysis_pkey (OID = 29612) : 
--
ALTER TABLE ONLY survey_analysis
    ADD CONSTRAINT survey_analysis_pkey
    PRIMARY KEY (survey_analysis_id);
--
-- Definition for index survey_answer_pkey (OID = 29617) : 
--
ALTER TABLE ONLY survey_answer
    ADD CONSTRAINT survey_answer_pkey
    PRIMARY KEY (survey_answer_id);
--
-- Definition for index survey_answer_complaint_detail_complaint_detail_id_key (OID = 29622) : 
--
ALTER TABLE ONLY survey_answer_complaint_detail
    ADD CONSTRAINT survey_answer_complaint_detail_complaint_detail_id_key
    UNIQUE (complaint_detail_id);
--
-- Definition for index syndrome_pkey (OID = 29627) : 
--
ALTER TABLE ONLY syndrome
    ADD CONSTRAINT syndrome_pkey
    PRIMARY KEY (syndrome_id);
--
-- Definition for index users_pkey (OID = 29635) : 
--
ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey
    PRIMARY KEY (user_id);
--
-- Definition for index users_login_key (OID = 29637) : 
--
ALTER TABLE ONLY users
    ADD CONSTRAINT users_login_key
    UNIQUE (login);
--
-- Definition for index fkc2f032dcc239a530 (OID = 29642) : 
--
ALTER TABLE ONLY analysis
    ADD CONSTRAINT fkc2f032dcc239a530
    FOREIGN KEY (syndrome_syndrome_id) REFERENCES syndrome(syndrome_id);
--
-- Definition for index fk62379f3fd2565e7b (OID = 29647) : 
--
ALTER TABLE ONLY analysis_norm
    ADD CONSTRAINT fk62379f3fd2565e7b
    FOREIGN KEY (analysis_analysis_id) REFERENCES analysis(analysis_id);
--
-- Definition for index fk9c29c64dc239a530 (OID = 29652) : 
--
ALTER TABLE ONLY anamnesis
    ADD CONSTRAINT fk9c29c64dc239a530
    FOREIGN KEY (syndrome_syndrome_id) REFERENCES syndrome(syndrome_id);
--
-- Definition for index fkac5efcabc468e733 (OID = 29657) : 
--
ALTER TABLE ONLY complaint
    ADD CONSTRAINT fkac5efcabc468e733
    FOREIGN KEY (complainttype_complaint_type_id) REFERENCES complaint_type(complaint_type_id);
--
-- Definition for index fkab50926512a2aa4a (OID = 29662) : 
--
ALTER TABLE ONLY complaint_detail
    ADD CONSTRAINT fkab50926512a2aa4a
    FOREIGN KEY (complaint_complaint_id) REFERENCES complaint(complaint_id);
--
-- Definition for index fk8cdc7e4ec239a530 (OID = 29667) : 
--
ALTER TABLE ONLY complaint_type
    ADD CONSTRAINT fk8cdc7e4ec239a530
    FOREIGN KEY (syndrome_syndrome_id) REFERENCES syndrome(syndrome_id);
--
-- Definition for index fk51f84483507f0488 (OID = 29672) : 
--
ALTER TABLE ONLY medicine_card_anamnesis
    ADD CONSTRAINT fk51f84483507f0488
    FOREIGN KEY (medicinecard_medicine_card_id) REFERENCES medicine_card(medicine_card_id);
--
-- Definition for index fk51f844837c291ca8 (OID = 29677) : 
--
ALTER TABLE ONLY medicine_card_anamnesis
    ADD CONSTRAINT fk51f844837c291ca8
    FOREIGN KEY (anamnesis_anamnesis_id) REFERENCES anamnesis(anamnesis_id);
--
-- Definition for index fka50f221c507f0488 (OID = 29682) : 
--
ALTER TABLE ONLY medicine_card_nosology
    ADD CONSTRAINT fka50f221c507f0488
    FOREIGN KEY (medicinecard_medicine_card_id) REFERENCES medicine_card(medicine_card_id);
--
-- Definition for index fka50f221c2ae5d5f1 (OID = 29687) : 
--
ALTER TABLE ONLY medicine_card_nosology
    ADD CONSTRAINT fka50f221c2ae5d5f1
    FOREIGN KEY (nosology_nosology_id) REFERENCES nosology(nosology_id);
--
-- Definition for index fk5d213f121187fd36 (OID = 29692) : 
--
ALTER TABLE ONLY nosology
    ADD CONSTRAINT fk5d213f121187fd36
    FOREIGN KEY (nosologytype_nosology_type_id) REFERENCES nosology_type(nosology_type_id);
--
-- Definition for index fk54f6a447c239a530 (OID = 29697) : 
--
ALTER TABLE ONLY nosology_type
    ADD CONSTRAINT fk54f6a447c239a530
    FOREIGN KEY (syndrome_syndrome_id) REFERENCES syndrome(syndrome_id);
--
-- Definition for index fkd0d3eb05507f0488 (OID = 29702) : 
--
ALTER TABLE ONLY patient
    ADD CONSTRAINT fkd0d3eb05507f0488
    FOREIGN KEY (medicinecard_medicine_card_id) REFERENCES medicine_card(medicine_card_id);
--
-- Definition for index fkcae3a75a507f0488 (OID = 29707) : 
--
ALTER TABLE ONLY survey
    ADD CONSTRAINT fkcae3a75a507f0488
    FOREIGN KEY (medicinecard_medicine_card_id) REFERENCES medicine_card(medicine_card_id);
--
-- Definition for index fkcae3a75aa203a68a (OID = 29712) : 
--
ALTER TABLE ONLY survey
    ADD CONSTRAINT fkcae3a75aa203a68a
    FOREIGN KEY (user_user_id) REFERENCES users(user_id);
--
-- Definition for index fk576f6221d2565e7b (OID = 29717) : 
--
ALTER TABLE ONLY survey_analysis
    ADD CONSTRAINT fk576f6221d2565e7b
    FOREIGN KEY (analysis_analysis_id) REFERENCES analysis(analysis_id);
--
-- Definition for index fk576f6221288530f9 (OID = 29722) : 
--
ALTER TABLE ONLY survey_analysis
    ADD CONSTRAINT fk576f6221288530f9
    FOREIGN KEY (survey_survey_id) REFERENCES survey(survey_id);
--
-- Definition for index fk76667c4312a2aa4a (OID = 29727) : 
--
ALTER TABLE ONLY survey_answer
    ADD CONSTRAINT fk76667c4312a2aa4a
    FOREIGN KEY (complaint_complaint_id) REFERENCES complaint(complaint_id);
--
-- Definition for index fk76667c43288530f9 (OID = 29732) : 
--
ALTER TABLE ONLY survey_answer
    ADD CONSTRAINT fk76667c43288530f9
    FOREIGN KEY (survey_survey_id) REFERENCES survey(survey_id);
--
-- Definition for index fk186926e15ff2373 (OID = 29737) : 
--
ALTER TABLE ONLY survey_answer_complaint_detail
    ADD CONSTRAINT fk186926e15ff2373
    FOREIGN KEY (survey_answer_id) REFERENCES survey_answer(survey_answer_id);
--
-- Definition for index fk186926e1c85e0a6d (OID = 29742) : 
--
ALTER TABLE ONLY survey_answer_complaint_detail
    ADD CONSTRAINT fk186926e1c85e0a6d
    FOREIGN KEY (complaint_detail_id) REFERENCES complaint_detail(complaint_detail_id);
--
-- Definition for index fk9459304da1e94b1e (OID = 29747) : 
--
ALTER TABLE ONLY users_role
    ADD CONSTRAINT fk9459304da1e94b1e
    FOREIGN KEY (role_id) REFERENCES role(role_id);
--
-- Definition for index fk9459304d47140efe (OID = 29752) : 
--
ALTER TABLE ONLY users_role
    ADD CONSTRAINT fk9459304d47140efe
    FOREIGN KEY (user_id) REFERENCES users(user_id);    
    
# --- !Downs

--drop database schema

DROP TABLE play_evolutions;
DROP TABLE users_role;
DROP TABLE users;
DROP TABLE syndrome;
DROP TABLE survey_answer_complaint_detail;
DROP TABLE survey_answer;
DROP TABLE survey_analysis;
DROP TABLE survey;
DROP TABLE role;
DROP TABLE patient;
DROP TABLE nosology_type;
DROP TABLE nosology;
DROP TABLE medicine_card_nosology;
DROP TABLE medicine_card_anamnesis;
DROP TABLE medicine_card;
DROP TABLE complaint_type;
DROP TABLE complaint_detail;
DROP TABLE complaint;
DROP TABLE anamnesis;
DROP TABLE analysis_norm;
DROP TABLE analysis;
