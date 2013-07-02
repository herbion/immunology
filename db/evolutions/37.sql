# --- !Ups

DELETE FROM clinical_manifestation WHERE id IN (4, 18, 20);


# --- !Downs

INSERT INTO clinical_manifestation(id, type, name, clinicalmanifestationcomplaint_clinical_manifestation_complaint)
    VALUES	(4, 0, 'Інше', 1),
			(18, 0, 'Інше', 4),
			(20, 0, 'Інше', 5);