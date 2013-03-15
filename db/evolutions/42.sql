# --- !Ups

ALTER TABLE survey ADD COLUMN nosology_nosology_id bigint; 

ALTER TABLE survey ADD CONSTRAINT fkcae3a75a2ae5d5f1
	FOREIGN KEY (nosology_nosology_id) 
	REFERENCES nosology (nosology_id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION;

	
# --- !Downs

ALTER TABLE survey DROP CONSTRAINT fkcae3a75a2ae5d5f1;

ALTER TABLE survey DROP COLUMN nosology_nosology_id;
