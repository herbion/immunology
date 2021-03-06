# --- !Ups
TRUNCATE clinical_manifestation CASCADE;
TRUNCATE clinical_manifestation_norm CASCADE;

INSERT INTO clinical_manifestation_complaint(
            clinical_manifestation_complaint_id, name, syndrome_syndrome_id)
    VALUES (1, 'З боку шкіри', 1),(2, 'З боку дихальних шляхів', 1),(3, 'З боку серцево-судинної системи', 1),
    		(4, 'З боку шлунково-кишкового тракту', 1), (5, 'З боку сечо-видільної та статевої системи', 1);

INSERT INTO clinical_manifestation(
            id, type, name, clinicalmanifestationcomplaint_clinical_manifestation_complaint)
    VALUES (1, 0, 'Почервоніння', 1),(2, 0, 'Висипання', 1),(3, 0, 'Набряк', 1),(4, 0, 'Інше', 1),
    		(5, 0, 'Частота дихання', 2),(6, 0, 'Дихання при аускультації', 2),(7, 0, 'Хрипи', 2),
    		(8, 0, 'Форма грудної клітки', 2),(9, 0, 'Участь в акті дихання допоміжної мускулатури', 2),
    		(10, 0, 'Ps', 3),(11, 0, 'А\Т', 3),(12, 0, 'Аскультація', 3),(13, 0, 'Тони серця', 3),
    		(14, 0, 'Серцеві шуми', 3),(15, 0, 'Живіт при пальпації', 4),(16, 0, 'Біль в животі при пальпації', 4),
    		(17, 0, 'Розміри печінки', 4),(18, 0, 'Інше', 4),(19, 0, 'С-м Пастернацького', 5),(20, 0, 'Інше', 5);

INSERT INTO clinical_manifestation_norm (id, description, update_date, value, clinicalmanifestation_id)
VALUES (1, 'Локальне', '2012-11-22 00:00:00', 3, 1),(2, 'Поширене', '2012-11-22 00:00:00', 3, 1),
		(3, 'Відсутнє', '2012-11-22 00:00:00', 0, 2),(4, 'Локальне', '2012-11-22 00:00:00', 3, 2),
		(5, 'Відсутнє', '2012-11-22 00:00:00', 0, 3),(6, 'Локальний', '2012-11-22 00:00:00', 3, 3),
		(7, 'Консистентний', '2012-11-22 00:00:00', 3, 3),(8, 'Норма', '2012-11-22 00:00:00', 0, 5),
		(9, 'Відхилення', '2012-11-22 00:00:00', 3, 5),(10, 'Норма', '2012-11-22 00:00:00', 0, 6),
		(11, 'Жорстке', '2012-11-22 00:00:00', 1, 6),(12, 'Ослаблене', '2012-11-22 00:00:00', 1, 6),
		(13, 'Норма', '2012-11-22 00:00:00', 0, 7),(14, 'Сухі поодинокі', '2012-11-22 00:00:00', 2, 7),
		(15, 'Сухі на всьому протязі', '2012-11-22 00:00:00', 3, 7),(16, 'Вологі поодинокі', '2012-11-22 00:00:00', 2, 7),
		(17, 'Вологі на всьому протязі', '2012-11-22 00:00:00', 3, 7),(18, 'Норма', '2012-11-22 00:00:00', 0, 8),
		(19, 'Відхилення', '2012-11-22 00:00:00', 3, 8),(20, 'Норма', '2012-11-22 00:00:00', 0, 9),
		(21, 'Відхилення', '2012-11-22 00:00:00', 3, 9),(22, 'Норма', '2012-11-22 00:00:00', 0, 10),
		(23, 'Тахікардія', '2012-11-22 00:00:00', 1, 10),(24, 'Брадікардія', '2012-11-22 00:00:00', 2, 10),
		(25, 'Аритмія', '2012-11-22 00:00:00', 3, 10),(26, 'Норма', '2012-11-22 00:00:00', 0, 11),
		(27, 'Відхилення', '2012-11-22 00:00:00', 3, 11),(28, 'Норма', '2012-11-22 00:00:00', 0, 12),
		(29, 'Аритмія', '2012-11-22 00:00:00', 3, 12),(30, 'Екстрасистологія', '2012-11-22 00:00:00', 3, 12),
		(31, 'Інше', '2012-11-22 00:00:00', 3, 12),(32, 'Норма', '2012-11-22 00:00:00', 0, 13),
		(33, 'Приглешені', '2012-11-22 00:00:00', 2, 13),(34, 'Глухі', '2012-11-22 00:00:00', 3, 13),
		(35, 'Норма', '2012-11-22 00:00:00', 0, 14),(36, 'Відхилення', '2012-11-22 00:00:00', 3, 14),
		(37, 'Норма', '2012-11-22 00:00:00', 0, 15),(38, 'Відхилення', '2012-11-22 00:00:00', 3, 15),
		(39, 'Відсутній', '2012-11-22 00:00:00', 0, 16),(40, 'Присутній', '2012-11-22 00:00:00', 3, 16),
		(41, 'Норма', '2012-11-22 00:00:00', 0, 17),(42, 'Збільшені', '2012-11-22 00:00:00', 3, 17),
		(43, 'Норма', '2012-11-22 00:00:00', 0, 19),(44, 'Відхилення', '2012-11-22 00:00:00', 3, 19);
		
SELECT setval('clinical_manifestation_complaint_sequence', 5, true);
SELECT setval('clinical_manifestation_sequence', 20, true);
SELECT setval('clinical_manifestation_norm_sequence', 44, true);
# --- !Downs
DROP TABLE clinical_manifestation_complaint CASCADE;
DROP TABLE clinical_manifestation CASCADE;
DROP TABLE clinical_manifestation_norm CASCADE;

SELECT setval('clinical_manifestation_complaint_sequence', 1, true);
SELECT setval('clinical_manifestation_sequence', 1, true);
SELECT setval('clinical_manifestation_norm_sequence', 1, true);
