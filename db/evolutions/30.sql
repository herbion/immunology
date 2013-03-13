# --- !Ups

ALTER TABLE survey_clinical_manifestation ADD COLUMN is_checked boolean;

ALTER TABLE survey_analysis ADD COLUMN is_checked boolean;

DELETE FROM medicationdetail_insertion WHERE medication_detail_id = 74;

INSERT INTO medicationdetail_insertion (medication_detail_id, insertion_id)
	VALUES (74,2), (74,3);

ALTER TABLE survey_treatment ADD COLUMN therapy_type integer;

ALTER TABLE treatmenttype ADD COLUMN has_therapy_type boolean DEFAULT FALSE;

UPDATE treatmenttype SET has_therapy_type = true WHERE treatment_type_id = 3;


# --- !Downs

UPDATE treatmenttype SET has_therapy_type = false WHERE treatment_type_id = 3;

ALTER TABLE treatmenttype DROP COLUMN has_therapy_type;

ALTER TABLE survey_treatment DROP COLUMN therapy_type;

DELETE FROM medicationdetail_insertion WHERE medication_detail_id = 74;

INSERT INTO medicationdetail_insertion (medication_detail_id, insertion_id)
	VALUES (74,5), (74,6), (74,7), (74,8), (74,9), (74,10);

ALTER TABLE survey_analysis DROP COLUMN IF EXISTS is_checked;

ALTER TABLE survey_clinical_manifestation DROP COLUMN IF EXISTS is_checked;