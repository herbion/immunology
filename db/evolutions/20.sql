# --- !Ups

ALTER TABLE survey_treatment ADD COLUMN insertion_insertion_id bigint;

ALTER TABLE survey_treatment
    ADD CONSTRAINT fkf7a031d3f880f046
    FOREIGN KEY (insertion_insertion_id) REFERENCES insertion(insertion_id);

# --- !Downs

ALTER TABLE survey_treatment DROP CONSTRAINT fkf7a031d3f880f046;

ALTER TABLE survey_treatment DROP COLUMN insertion_insertion_id;

