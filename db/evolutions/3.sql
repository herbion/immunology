# --- !Ups

--test data

------------------------syndrome data------------------------

INSERT INTO syndrome (syndrome_id, name) VALUES ('1', 'Алергічний');

INSERT INTO syndrome (syndrome_id, name) VALUES ('2', 'Автоімунний');

INSERT INTO syndrome (syndrome_id, name) VALUES ('3', 'Імунодефіцит-інфекційний');

ALTER SEQUENCE syndrome_sequence START 4;
ALTER SEQUENCE syndrome_sequence RESTART;

------------------------complaint_type data------------------------

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('1', '1.0', 'З боку шкіри', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('2', '1.0', 'З боку носа', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('3', '1.0', 'З боку дихальних шляхів', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('4', '1.0', 'З боку серцево-судинної системи', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('5', '1.0', 'З боку шлунково-кишкового тракту', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('6', '1.0', 'З боку сечо-статевої системи', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('7', '1.0', 'Психо-неврологічний статус', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('8', '1.0', 'З боку органу зору', '1');

INSERT INTO complaint_type (complaint_type_id, multyplier, name, syndrome_syndrome_id)
VALUES ('9', '1.0', 'З боку органу слуху', '1');

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (10, 'Температура', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (11, 'Збоку шкіри та придатків ', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (12, 'З боку кістково-суглобової та м’язової с-ми', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (13, 'З боку органів дихання', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (14, 'З боку серцево-судинної с-ми', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (15, 'З боку шлунково-кишкового каналу ', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (16, 'З боку видільної  с-ми ', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (17, 'З боку ендокринної с-ми', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (18, 'З боку нервової с-ми', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (19, 'З боку органа зору (очей)', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (20, 'З боку органу слуху(вуха)', 1, 2);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (21, 'З боку шкіри', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (22, 'З боку носа', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (23, 'З боку органів дихання', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (24, 'З боку серцево-судинної с-ми', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (25, 'З боку шлунково-кишкового каналу ', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (26, 'З боку сечостатевої с-ми', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (27, 'З боку нервової психічної с-ми', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (28, 'З боку органа зору (очей)', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (29, 'З боку органа слуху (вух)', 1, 3);

INSERT INTO complaint_type (complaint_type_id, name, multyplier, syndrome_syndrome_id)
VALUES (30, 'З боку лімфатичних вузлів', 1, 3);

ALTER SEQUENCE complaint_type_sequence START 31;
ALTER SEQUENCE complaint_type_sequence RESTART;

------------------------complaint data------------------------

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('1', 'Сухість', '1');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('2', 'Свербіж', '1');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('3', 'Інше', '1');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('4', 'Чхання', '2');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('5', 'Свербіж', '2');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('6', 'Заложеність', '2');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('7', 'Виділення з носових ходів', '2');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('8', 'Інше', '2');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('9', 'Першіння в горлі', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('10', 'Печія в горлі', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('11', 'Свербіж в горлі', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('12', 'Біль в горлі', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('13', 'Кашель', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('14', 'Задишка', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('15', 'Бронхіальна астма', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('16', 'Інше', '3');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('17', 'Болі в області серця', '4');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('18', 'Інше', '4');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('19', 'Нудота', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('20', 'Печія', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('21', 'Вздуття', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('22', 'Діарея', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('23', 'Закрепи', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('24', 'Біль в животі', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('25', 'Зниження маси тіла', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('26', 'Інше', '5');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('27', 'Печія', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('28', 'Свербіж', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('29', 'Порушення сечовипускання', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('30', 'Набряк слизової', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('31', 'Набряк шкіри області геніталій', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('32', 'Висипання', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('33', 'Інше', '6');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('34', 'Психоемоційна лабільність', '7');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('35', 'Збудження', '7');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('36', 'Загальмованість', '7');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('37', 'Депресія', '7');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('38', 'Порушення пам''яті', '7');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('39', 'Інше', '7');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('40', 'Печія в очах', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('41', 'Свербіж', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('42', 'Почервоніння кон''юнктиви', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('43', 'Сльозотеча', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('44', 'Набряк', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('45', 'Виділення', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('46', 'Інше', '8');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('47', 'Свербіж', '9');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('48', 'Сухість шкіри', '9');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('49', 'Шум', '9');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('50', 'Закладеність', '9');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('51', 'Набряк', '9');

INSERT INTO complaint (complaint_id, name, complainttype_complaint_type_id)
VALUES ('52', 'Інше', '9');

ALTER SEQUENCE complaint_sequence START 53;
ALTER SEQUENCE complaint_sequence RESTART;


# --- !Downs

--drop test data

------------------------complaint data------------------------

DELETE FROM complaint WHERE complaint_id BETWEEN '1' AND '52';

------------------------complaint_type data------------------------

DELETE FROM complaint_type WHERE complaint_type_id BETWEEN '1' AND '30';

------------------------syndrome data------------------------

DELETE FROM syndrome WHERE syndrome_id BETWEEN '1' AND '3';

