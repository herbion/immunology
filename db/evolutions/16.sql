# --- !Ups
--drop new columns from survey table
ALTER TABLE survey DROP COLUMN difficulty_degree;
ALTER TABLE survey DROP COLUMN insufficiency_degree;

--Added new columns to survey table
--
-- Column "alergetic_difficulty_degree"
--
ALTER TABLE survey ADD COLUMN alergetic_difficulty_degree integer DEFAULT 0;
--
-- Column "autoimmuno_difficulty_degree"
--
ALTER TABLE survey ADD COLUMN autoimmuno_difficulty_degree integer DEFAULT 0;
--
-- Column "immunodef_difficulty_degree"
--
ALTER TABLE survey ADD COLUMN immunodef_difficulty_degree integer DEFAULT 0;
--
-- Column "alergetic_insufficiency_degree"
--
ALTER TABLE survey ADD COLUMN alergetic_insufficiency_degree integer DEFAULT 0;
--
-- Column "autoimmuno_insufficiency_degree"
--
ALTER TABLE survey ADD COLUMN autoimmuno_insufficiency_degree integer DEFAULT 0;
--
-- Column "immunodef_insufficiency_degree"
--
ALTER TABLE survey ADD COLUMN immunodef_insufficiency_degree integer DEFAULT 0;

# --- !Downs

--
-- Column "autoimmuno_insufficiency_degree"
--
ALTER TABLE survey ADD COLUMN difficulty_degree integer DEFAULT 0;
--
-- Column "immunodef_insufficiency_degree"
--
ALTER TABLE survey ADD COLUMN insufficiency_degree integer DEFAULT 0;

--drop new columns from survey table

ALTER TABLE survey DROP COLUMN alergetic_difficulty_degree;

ALTER TABLE survey DROP COLUMN autoimmuno_difficulty_degree;

ALTER TABLE survey DROP COLUMN immunodef_difficulty_degree;

ALTER TABLE survey DROP COLUMN alergetic_insufficiency_degree;

ALTER TABLE survey DROP COLUMN autoimmuno_insufficiency_degree;

ALTER TABLE survey DROP COLUMN immunodef_insufficiency_degree;