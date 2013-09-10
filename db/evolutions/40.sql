# --- !Ups
INSERT INTO nosology(nosology_id, name, syndrome_syndrome_id)
    VALUES (1, 'Алергічний риносинусит', 1),(2, 'Бронхіальна астма', 1),(3, 'Поліноз', 1),
    		(4, 'Алергічний кон"юктивіт', 1),(5, 'Алергічний гастроентерополіт', 1),
    		(6, 'Алергічний цистіт', 1),(7, 'Кропив"янка', 1),(8, 'Алергічний контактний дерматит', 1),
    		(9, 'Атопічний дерматит', 1);

SELECT setval('nosology_sequence', 9, true);
    		
INSERT INTO nosology_complaint_type(
            nosology_complaint_type_id, complaint_type_id, multyplier, nosology_nosology_id)
    VALUES (1, 2, 1.0, 1),(2, 3, 0.2, 1),(3, 7, 0.1, 1),
    		(4, 3, 1.0, 2),(5, 4, 0.1, 2),(6, 7, 0.2, 2),
    		(7, 2, 1.0, 3),(8, 3, 0.2, 3),(9, 7, 0.1, 3),
    		(10, 8, 1.0, 4),
    		(11, 5, 1.0, 5),(12, 7, 0.2, 5),
    		(13, 6, 1.0, 6),
    		(14, 1, 1.0, 7),(15, 7, 0.3, 7),
    		(16, 1, 1.0, 8),(17, 7, 0.1, 8),
    		(18, 1, 1.0, 9),(19, 7, 0.2, 9);

SELECT setval('nosology_complaint_type_sequence', 19, true);
    		
INSERT INTO nosology_clinical_manifestation(nosology_clinical_manifestation_id, clinical_manifestation_id, 
            multyplier, nosology_nosology_id)
    VALUES (1, 2, 1.0, 1),
    		(2, 2, 1.0, 2),
    		(3, 2, 1.0, 3),
    		(4, 4, 1.0, 5),
    		(5, 5, 1.0, 6),
    		(6, 1, 1.0, 7),
    		(7, 1, 1.0, 8),
    		(8, 1, 1.0, 9);
    		
SELECT setval('nosology_clinical_manifestation_sequence', 8, true);    		
    		
INSERT INTO nosology_analysis(nosology_analysis_id, analysis_id, multyplier, nosology_nosology_id)
    VALUES (1, 3, 1.0, 1),(2, 4, 1.0, 1),(3, 5, 1.0, 1),(4, 6, 1.0, 1),(5, 7, 0.1, 1),(6, 12, 1.0, 1),
    		(7, 10, 0.3, 1),(8, 11, 0.3, 1),(9, 20, 1.0, 1),
    		(10, 3, 1.0, 2),(11, 4, 1.0, 2),(12, 5, 1.0, 2),(13, 6, 1.0, 2),(14, 7, 1.0, 2),(15, 12, 1.0, 2),
    		(16, 10, 0.3, 2),(17, 11, 0.3, 2),
    		(18, 3, 1.0, 3),(19, 4, 1.0, 3),(20, 5, 1.0, 3),(21, 6, 1.0, 3),(22, 7, 0.1, 3),(23, 12, 1.0, 3),
    		(24, 10, 0.3, 3),(25, 11, 0.3, 3),(26, 20, 1.0, 3),
    		(27, 3, 1.0, 4),(28, 4, 1.0, 4),(29, 5, 1.0, 4),(30, 6, 1.0, 4),(31, 12, 1.0, 4),(32, 10, 0.2, 4),
    		(33, 11, 0.1, 4),
    		(34, 3, 1.0, 5),(35, 4, 1.0, 5),(36, 5, 1.0, 5),(37, 6, 1.0, 5),(38, 12, 1.0, 5),(39, 9, 1.0, 5),
    		(40, 10, 0.2, 5),(41, 11, 0.1, 5),(42, 20, 1.0, 5),(43, 21, 1.0, 5),(44, 22, 1.0, 5),
    		(45, 3, 1.0, 6),(46, 5, 1.0, 6),(47, 6, 1.0, 6),(48, 12, 1.0, 6),(49, 9, 1.0, 6),(50, 10, 0.1, 6),
    		(51, 11, 0.1, 6),(52, 20, 1.0, 6),(53, 21, 1.0, 6),(54, 22, 1.0, 6),
    		(55, 3, 1.0, 7),(56, 5, 1.0, 7),(57, 6, 1.0, 7),(58, 12, 1.0, 7),(59, 9, 1.0, 7),(60, 10, 1.0, 7),
    		(61, 11, 1.0, 7),(62, 15, 1.0, 7),(63, 20, 1.0, 7),(64, 21, 1.0, 7),(65, 22, 1.0, 7),(66, 16, 1.0, 7),
    		(67, 17, 1.0, 7),(68, 18, 1.0, 7),
    		(69, 9, 1.0, 8),(70, 19, 1.0, 8),
    		(71, 3, 1.0, 9),(72, 5, 1.0, 9),(73, 6, 1.0, 9),(74, 12, 1.0, 9),(75, 9, 1.0, 9),(76, 10, 0.2, 9),
    		(77, 11, 0.2, 9),(78, 22, 1.0, 9);

SELECT setval('nosology_analysis_sequence', 78, true); 
# --- !Downs
DROP TABLE nosology CASCADE;
DROP TABLE nosology_complaint_type CASCADE;
DROP TABLE nosology_clinical_manifestation CASCADE;
DROP TABLE nosology_analysis CASCADE;

SELECT setval('nosology_analysis_sequence', 1, true); 
SELECT setval('nosology_clinical_manifestation_sequence', 1, true);  
SELECT setval('nosology_complaint_type_sequence', 1, true);
SELECT setval('nosology_sequence', 1, true);