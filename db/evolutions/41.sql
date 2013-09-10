# --- !Ups

DELETE FROM anamnesis WHERE anamnesis_id = 6;

ALTER TABLE medicine_card_anamnesis DROP COLUMN anamnesis_anamnesis_id;

ALTER TABLE medicine_card_anamnesis ADD COLUMN anamnesisdetailvalue_anamnesis_detail_value_id bigint;

ALTER TABLE medicine_card_anamnesis ADD COLUMN is_checked boolean;

# --- !Downs

ALTER TABLE medicine_card_anamnesis DROP COLUMN is_checked;

ALTER TABLE medicine_card_anamnesis DROP COLUMN anamnesisdetailvalue_anamnesis_detail_value_id;

ALTER TABLE medicine_card_anamnesis ADD COLUMN anamnesis_anamnesis_id bigint;

INSERT INTO anamnesis(anamnesis_id, name, syndrome_syndrome_id)
    VALUES (6, 'Інше', 1);
