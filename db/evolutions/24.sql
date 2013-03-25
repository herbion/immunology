# --- !Ups

INSERT INTO anamnesis_detail(
            anamnesis_detail_id, name, anamnesis_id)
    VALUES (1, 'Лісовий горіх', 8),(2, 'Арахіс', 8),(3, 'Волоський горіх', 8),(4, 'Грецький горіх', 8),
    (5, 'Мигдаль', 8),(6, 'Молоко', 8),(7, 'Білок курячого яйця', 8),(8, 'Жовток курячого яйця', 8),
    (9, 'Казеїн', 8),(10, 'Картопля', 8),(11, 'Селера', 8),(12, 'Морква', 8),
    (13, 'Помідор', 8),(14, 'Тріска', 8),(15, 'Креветки', 8),(16, 'Персик', 8),
    (17, 'Яблуко', 8),(18, 'Соя', 8),(19, 'Пшеничне борошно', 8),(20, 'Кунжут', 8),
    (21, 'Житнє борошно', 8),(22, 'Гречка', 8),(23, 'Какао', 8),(24, 'Гольдський сир', 8),
    (25, 'Тунець', 8),(26, 'Лосось', 8),(27, 'Свинина', 8),(28, 'Курятина', 8),
    (29, 'Телятина', 8),(30, 'Суміш цитрусових', 8),(31, 'Дріжджова випічка', 8),(32, 'Рис', 8),
    (33, 'Ячмінне борошно', 8),(34, 'Часник', 8),(35, 'Солодкий каштан', 8),(36, 'Скумбрія', 8),
    (37, 'Цибуля', 8),
    (38, 'Бджола', 9),(39, 'Оса', 9),(40, 'Шершень', 9),(41, 'Комар', 9),(42, 'Мушка', 9),
    (43, 'Тарган', 9),(44, 'Тля', 9),(45, 'Довгоносик амбарний', 9),
    (46, 'Бородавчатої берези', 7),(47, 'Сірої вільхи', 7),(48, 'Горіха', 7),(49, 'Дуба', 7),
    (50, 'Тимофіївки лугової', 7),(51, 'Жита', 7),(52, 'Полину', 7),(53, 'Вільхи', 7),(54, 'Хризантеми', 7),
    (55, 'Мітлиці білої', 7),(56, 'Амброзія', 7),(57, 'Клена', 7),(58, 'Будяка', 7),(59, 'Кедра', 7),
    (60, 'Бузку', 7),(61, 'Ясена', 7),(62, 'Акації', 7),(63, 'Ліщини', 7),(64, 'Лободи (амарант)', 7),
    (65, 'Польового вівса', 7),(66, 'Польових  трав', 7),(67, 'Грястиці збірної', 7),(68, 'Золотушника', 7),
    (69, 'Кульбаби', 7),(70, 'Латикс', 7),(71, 'Ланцетного подорожника', 7),
    (72, 'Грибок Alt tenuis', 11),(73, 'Грибок Asp.Fumigatus', 11),(74, 'Грибок Cladosp. herbarum', 11),
    (75, 'Грибок  Pen. notatum ', 11),
    (76, 'Пір"я качки', 6),(77, 'Пір"я канарки', 6),(78, 'Пір"я гуски', 6),(79, 'Пір"я папуги', 6),
    (80, 'Cобаки', 6),(81, 'Кота', 6),(82, 'Коня', 6),(83, 'Краб', 6),
    (84, 'Морської свинки', 6),(85, 'Хом"яка', 6),(86, 'Кролика', 6),(87, 'Миші', 6),
    (88, 'Щура', 6),
    (89, 'Кліщ D. рteronyssinus', 16),(90, 'Кліщ D. farinae', 16),(91, 'Сирний кліщ Tyrophagus putrescentiae', 16)
    ;
--
-- Data for sequence public.anamnesis_detail_sequence (OID = 177321)
--
SELECT pg_catalog.setval('anamnesis_detail_sequence', 91, true);
# --- !Downs

DELETE FROM anamnesis_detail WHERE anamnesis_detail_id BETWEEN 1 AND 91;