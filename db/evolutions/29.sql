# --- !Ups
INSERT INTO anamnesis(
            anamnesis_id, name, type, syndrome_syndrome_id, value)
    VALUES (21, 'Супутні захворювання', 1, 1, 3);
--
-- Data for sequence public.analysis_detail_sequence (OID = 177321)
--
SELECT pg_catalog.setval('anamnesis_sequence', 21, true);
# --- !Downs

DELETE FROM anamnesis WHERE anamnesis_id = 21;

SELECT pg_catalog.setval('anamnesis_sequence', 20, true);