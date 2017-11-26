CREATE TABLE IF NOT EXISTS recipe (
  id              BIGINT PRIMARY KEY NOT NULL,
  title           VARCHAR(256)       NOT NULL,
  category        VARCHAR(50)        NOT NULL,
  preparation     VARCHAR(512)       NOT NULL,
  nrOfPersons     INT                NOT NULL,
  preparationTime INT                NOT NULL,
  cookingTime     INT                NOT NULL
);

CREATE TABLE IF NOT EXISTS ingredient (
  id        BIGINT PRIMARY KEY NOT NULL,
  title     VARCHAR(265)       NOT NULL,
  kind      VARCHAR(50)        NOT NULL,
  type      VARCHAR(50)        NOT NULL,
  quantity  INT                NOT NULL,
  measure   VARCHAR(50)        NOT NULL,
  recipe_id BIGINT REFERENCES recipe (id)
);
