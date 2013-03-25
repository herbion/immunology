# --- !Ups

DELETE FROM complaint WHERE complaint_id IN (6,7,30,32,48,49);

INSERT INTO complaint(complaint_id, name, complainttype_complaint_type_id)
    VALUES (227,'Заложеність (сезонна)', 2),(228,'Заложеність (цілорічна)', 2),(229,'Характер виділень з носових ходів (слизисті)', 2),
    		(230,'Характер виділень з носових ходів (гнійні)', 2),(231,'Характер виділень з носових ходів (водянисті)', 2),
    		(232,'Характер виділень з носових ходів (з домішками крові)', 2),(233,'Артеріальний тиск', 4),
    		(234,'Пульс (серцебиття)', 4),(235,'Набряк слизової в області геніталій', 6),(236,'Висипання (шкіра)', 6),(237,'Висипання (слизові)', 6),
    		(238,'Запоморочення', 7),(239,'Сухість шкіри слухового проходу', 9),(240,'Шум у вусі', 9);
  
SELECT setval('complaint_sequence', 240, true);
# --- !Downs
INSERT INTO complaint(complaint_id, name, complainttype_complaint_type_id)
    VALUES (6,'Заложеність', 2),(7,'Виділення з носових ходів', 2),(30,'Набряк слизової', 6),(32,'Висипання', 6),
    		(48,'Сухість шкіри', 9),(49,'Шум', 9);
    		
DELETE FROM complaint WHERE complaint_id BETWEEN 227 AND 240;

SELECT setval('complaint_sequence', 226, true);
