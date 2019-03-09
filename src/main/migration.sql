create database javaeelabdb
 with owner postgres;

create table if not exists students
(
 id serial not null
  constraint students_pk
   primary key,
 pib varchar(100) not null,
 course integer not null
);

alter table students owner to postgres;

create table if not exists teachers
(
 teacherid serial not null
  constraint teachers_pk
   primary key,
 firstname varchar(45) not null,
 lastname varchar(45) not null,
 birth_date date not null,
 cell_phone varchar(15) not null
);

alter table teachers owner to postgres;