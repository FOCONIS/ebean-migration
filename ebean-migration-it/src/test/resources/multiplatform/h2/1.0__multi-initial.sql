-- Migrationscripts for ebean unittest
-- apply changes
create table junk (
  id                            integer generated by default as identity not null,
  assoc_one                     varchar(255)
);
