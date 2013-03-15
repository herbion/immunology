# --- !Ups

DELETE FROM insertion WHERE insertion_id BETWEEN 4 AND 10;

ALTER TABLE survey_treatment ADD COLUMN allergen_allergen_id bigint; 

ALTER TABLE survey_treatment ADD CONSTRAINT fkf7a031d3a41d0361
	FOREIGN KEY (allergen_allergen_id) 
	REFERENCES allergen (allergen_id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION;

ALTER TABLE allergen DROP COLUMN IF EXISTS medicationdetail_medication_detail_id;

ALTER TABLE allergen RENAME COLUMN medication_detail_id TO medicationdetail_medication_detail_id;
	
# --- !Downs

ALTER TABLE allergen RENAME COLUMN medicationdetail_medication_detail_id TO medication_detail_id;

ALTER TABLE allergen ADD COLUMN medicationdetail_medication_detail_id bigint;

ALTER TABLE survey_treatment DROP CONSTRAINT fkf7a031d3a41d0361;

ALTER TABLE survey_treatment DROP COLUMN allergen_allergen_id;

INSERT INTO insertion(insertion_id, name)
     VALUES (4, 'Суміш весняна рання'),
     		(5, 'Суміш весняна пізня'),
     		(6, 'Суміш осіння'),
    		(7, 'Суміш трав 1'),
    		(8, 'Суміш трав 2'),
    		(9, 'Весняні дерева'),
    		(10, 'Pollinare mixtum');
