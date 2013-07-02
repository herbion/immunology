# --- !Ups

--
-- Structure for table allergen : 
--
CREATE TABLE allergen
(
  allergen_id bigint NOT NULL,
  name character varying(255),
  medication_detail_id bigint,
  CONSTRAINT allergen_pkey PRIMARY KEY (allergen_id ),
  CONSTRAINT fk239053c1a4cf1c0e FOREIGN KEY (medication_detail_id)
      REFERENCES medication_detail (medication_detail_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
--
-- Definition for sequence allergen_sequence : 
--
CREATE SEQUENCE allergen_sequence
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;


INSERT INTO allergen(allergen_id, name, medication_detail_id)
    VALUES (1, 'Суміш весняна рання', 74),(2, 'Суміш весняна пізня', 74),(3, 'Суміш осіння', 74),
    		(4, 'Суміш трав 1', 74),(5, 'Суміш трав 2', 74),(6, 'Весняні дерева', 74),
    		(7, 'Pollinare mixtum', 74);  
    		
SELECT pg_catalog.setval('allergen_sequence', 7, true);
# --- !Downs
DROP TABLE IF EXISTS allergen CASCADE;

DROP SEQUENCE IF EXISTS allergen_sequence;

DELETE FROM allergen WHERE allergen_id BETWEEN 1 AND 7;

SELECT pg_catalog.setval('allergen_sequence', 1, true);