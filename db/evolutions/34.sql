# --- !Ups
INSERT INTO anamnesis(
            anamnesis_id, name, syndrome_syndrome_id)
    VALUES (1, 'Генетична (вроджена) схильність до алергії', 1),
    		(2, 'Особливості анамнезу в дитячому віці', 1),
    		(3, 'Умови проживання', 1),(4, 'Умови праці (професійні шкідливості)', 1),
    		(5, 'Шкідливі звички', 1),(6, 'Інші', 1);
    		
INSERT INTO anamnesis_detail(
            anamnesis_detail_id, name, type, anamnesis_anamnesis_id)
    VALUES (1, 'Хворі на алергію родичі', 0, 1),
    		(2, 'Грудне вигодовування', 1, 2),
    		(3, 'Наявність алергії в дитячому віці', 1, 2),
    		(4, 'Важкість умов проживання', 1, 3),
    		(5, 'Важкість умов для праці', 1, 4),
    		(6, 'Паління', 1, 5);

INSERT INTO anamnesis_detail_value(
            anamnesis_detail_value_id, name, value, anamnesisdetail_anamnesis_detail_id)
    VALUES (1, 'брат/сестра', '1.0', 1),
    		(2, 'мати', '2.5', 1),
    		(3, 'батько', '2.0', 1),
    		(4, 'мати/батько', '3.0', 1),
    		(5, 'інші', '1.0', 1),
    		(6, 'До 3 місяців', '2.0', 2),
    		(7, 'До 6 місяців', '1.0', 2),
    		(8, 'До 12 місяців', '0.0', 2),
    		(9, 'Штучне вигодування', '3.0', 2),
    		(10, 'Не відомо', '0.0', 2),
    		(11, 'Ні', '0.0', 3),
    		(12, 'Так', '3.0', 3),
    		(13, '0', '0.0', 4),
    		(14, '1', '1.0', 4),
    		(15, '2', '2.0', 4),
    		(16, '3', '3.0', 4),
    		(17, '0', '0.0', 5),
    		(18, '1', '1.0', 5),
    		(19, '2', '2.0', 5),
    		(20, '3', '3.0', 5),
    		(21, 'До 1 року', '1.0', 6),
    		(22, 'До 1-5 років', '2.0', 6),
    		(23, 'Більше 5років', '3.0', 6),
    		(24, 'Відсутнє', '0.0', 6),
    		(25, 'Припинення паління', '0.0', 6);

    		
INSERT INTO anamnesis_disease(
            anamnesis_disease_id, name, type, syndrome_syndrome_id)
    VALUES (1, 'Спостерігались алергічні реакції на:', 0, 1),
    		(2, 'Період тривалості алергії', 1, 1),
    		(3, 'Сезонність', 1, 1),
    		(4, 'Частота загострень протягом року', 1, 1),
    		(5, 'Ефективність застосування лікування', 1, 1),
    		(6, 'Ефективність застосування СІТ', 1, 1),
    		(7, 'Ефективність застосування антигістамміних препаратів', 1, 1);

INSERT INTO anamnesis_disease_detail(
            anamnesis_disease_detail_id, name, value, anamnesisdisease_anamnesis_disease_id)
    VALUES (1, 'Побутові фактори', 3.0, 1),
    		(2, 'Рослинні фактори', 3.0, 1),
    		(3, 'Харчові фактори', 3.0, 1),
    		(4, 'Укуси комах', 3.0, 1),
    		(5, 'Медикаментозні', 3.0, 1),
    		(6, 'Грибкові', 3.0, 1),
    		(7, 'Косметичні засоби', 3.0, 1),
    		(8, 'Хімічні фактори', 3.0, 1),
    		(9, 'Інші', 3.0, 1),
    		(10, 'До 1 року', 1.0, 2),
    		(11, '1-5 років', 2.0, 2),
    		(12, '5-10 років', 3.0, 2),
    		(13, 'Більше 10 років', 4.0, 2),
    		(14, 'Ні', 0.0, 3),
    		(15, 'Так', 3.0, 3),
    		(16, '1 раз', 1.0, 4),
    		(17, '2-6 разів', 2.0, 4),
    		(18, 'Ефективне', 0.0, 5),
    		(19, 'Не ефективне', 3.0, 5),
    		(20, 'Ефективне', 0.0, 6),
    		(21, 'Не ефективне', 3.0, 6),
    		(22, 'Не ефективне', 0.0, 7),
    		(23, 'Ефективне', 3.0, 7);
    		
UPDATE complaint
   SET name='Свербіж (лоскотання)'
 WHERE complaint_id = 5;
 
DELETE FROM complaint WHERE complaint_id = 13;
DELETE FROM complaint WHERE complaint_id = 15;
 
INSERT INTO complaint(
            complaint_id, name, complainttype_complaint_type_id)
    VALUES (216, 'Висипка', 1),(217, 'Блювота', 5),(218, 'Кашель (сухий)', 3),
    		(219, 'Кашель (вологий)', 3),(220, 'Кашель (періодичний)', 3),
    		(221, 'Кашель (постійний)', 3),(222, 'Приступи ядухи', 3);
 

SELECT setval('anamnesis_sequence', 6, true);
SELECT setval('anamnesis_detail_sequence', 6, true);
SELECT setval('anamnesis_detail_value_sequence', 25, true);
SELECT setval('anamnesis_disease_sequence', 8, true);
SELECT setval('anamnesis_disease_detail_sequence', 23, true);
SELECT setval('complaint_sequence', 222, true);

# --- !Downs

DELETE FROM anamnesis WHERE id BETWEEN 1 AND 6;
DELETE FROM anamnesis_detail WHERE id BETWEEN 1 AND 6;
DELETE FROM anamnesis_detail_value WHERE id BETWEEN 1 AND 25;
DELETE FROM anamnesis_disease WHERE id BETWEEN 1 AND 8;
DELETE FROM anamnesis_disease_detail WHERE id BETWEEN 1 AND 23;

DELETE FROM complaint WHERE complaint_id BETWEEN 216 AND 222;

UPDATE complaint
   SET name='Свербіж'
 WHERE complaint_id = 5;
 
INSERT INTO complaint(
            complaint_id, name, complainttype_complaint_type_id)
    VALUES (13, 'Кашель', 3),(15, 'Бронхіальна астма', 3);


SELECT setval('anamnesis_sequence', 1, true);
SELECT setval('anamnesis_detail_sequence', 1, true);
SELECT setval('anamnesis_detail_value_sequence', 1, true);
SELECT setval('anamnesis_disease_sequence', 1, true);
SELECT setval('anamnesis_disease_detail_sequence', 1, true);
SELECT setval('complaint_sequence', 215, true);