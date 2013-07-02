# --- !Ups
INSERT INTO treatment_group(
            treatment_group_id, date, maxvalue, minvalue, name)
    VALUES (1, '2012-10-21 00:00:00', 2, 1, 'Група 1'),(2, '2012-10-21 00:00:00', 2, 1, 'Група 2'),
    (3, '2012-10-21 00:00:00', 2, 1, 'Група 3'),(4, '2012-10-21 00:00:00', 2, 1, 'Група 4'),
    (5, '2012-10-21 00:00:00', 2, 1, 'Група 5'),(6, '2012-10-21 00:00:00', 2, 1, 'Група 6');
# --- !Downs
DELETE FROM treatment_group WHERE treatment_group_id BETWEEN 1 AND 6;
