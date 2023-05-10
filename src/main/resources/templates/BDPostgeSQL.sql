-- Database: alianza

-- DROP DATABASE IF EXISTS alianza;

CREATE DATABASE alianza
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
-- Table: public.clientes

-- DROP TABLE IF EXISTS public.clientes;

CREATE TABLE IF NOT EXISTS public.clientes
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    sharedkey character varying(255) COLLATE pg_catalog."default" NOT NULL,
    businessid character varying(255) COLLATE pg_catalog."default",
    email character varying(255) COLLATE pg_catalog."default",
    phone character varying(255) COLLATE pg_catalog."default",
    dataadded date,
    CONSTRAINT user_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.clientes
    OWNER to postgres;