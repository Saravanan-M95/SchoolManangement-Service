-- Table: public.parents

-- DROP TABLE IF EXISTS public.parents;

CREATE TABLE IF NOT EXISTS public.parents
(
    student_id bigint,
    father_nic_no character varying(128) COLLATE pg_catalog."default",
    father_name character varying(256) COLLATE pg_catalog."default",
    father_occupation character varying(256) COLLATE pg_catalog."default",
    father_office_address text COLLATE pg_catalog."default",
    father_mobile character varying(128) COLLATE pg_catalog."default",
    father_email character varying(128) COLLATE pg_catalog."default",
    is_father_old_student boolean,
    mother_maiden_name character varying(256) COLLATE pg_catalog."default",
    mother_name character varying(256) COLLATE pg_catalog."default",
    mother_occupation character varying(256) COLLATE pg_catalog."default",
    mother_office_address text COLLATE pg_catalog."default",
    mother_mobile character varying(128) COLLATE pg_catalog."default",
    mother_email character varying(128) COLLATE pg_catalog."default",
    is_mother_old_student boolean,
    is_guardian_parent boolean,
    guardian_name character varying(128) COLLATE pg_catalog."default",
    guardian_office_address text COLLATE pg_catalog."default",
    guardian_mobile_no character varying(128) COLLATE pg_catalog."default",
    guardian_email character varying(128) COLLATE pg_catalog."default",
    id bigint NOT NULL DEFAULT nextval('parent_id_seq'::regclass),
    CONSTRAINT parents_pkey PRIMARY KEY (id),
    CONSTRAINT fk_student_id FOREIGN KEY (student_id)
        REFERENCES public.student (student_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.parents
    OWNER to postgres;
	
///////////////////////

-- Table: public.student

-- DROP TABLE IF EXISTS public.student;

CREATE TABLE IF NOT EXISTS public.student
(
    student_id bigint NOT NULL DEFAULT nextval('student_id_seq'::regclass),
    admission_no integer DEFAULT nextval('admission_no_seq'::regclass),
    first_name character varying(128) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    last_name character varying(128) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    middle_name character varying(128) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    admission_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    address text COLLATE pg_catalog."default" DEFAULT ''::text,
    contact_no character varying(64) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    religion character varying(128) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    race character varying(64) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    dob timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    gender character varying(64) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    current_class character varying(128) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    former_class character varying(64) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    former_school character varying(128) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    is_hostelate boolean DEFAULT false,
    is_sibiling_in_our_school boolean DEFAULT false,
    standard character varying(16) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    division character varying(8) COLLATE pg_catalog."default" DEFAULT ''::character varying,
    CONSTRAINT student_pk PRIMARY KEY (student_id),
    CONSTRAINT student_admission_no_key UNIQUE (admission_no)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.student
    OWNER to postgres;
	

////////////////////////


-- SEQUENCE: public.admission_no_seq

-- DROP SEQUENCE IF EXISTS public.admission_no_seq;

CREATE SEQUENCE IF NOT EXISTS public.admission_no_seq
    INCREMENT 1
    START 1000
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.admission_no_seq
    OWNED BY public.student.admission_no;

ALTER SEQUENCE public.admission_no_seq
    OWNER TO postgres;
	
	
////////////////////////

-- SEQUENCE: public.parent_id_seq

-- DROP SEQUENCE IF EXISTS public.parent_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.parent_id_seq
    INCREMENT 1
    START 100
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.parent_id_seq
    OWNED BY public.parents.id;

ALTER SEQUENCE public.parent_id_seq
    OWNER TO postgres;
	

////////////////////////

-- SEQUENCE: public.student_id_seq

-- DROP SEQUENCE IF EXISTS public.student_id_seq;

CREATE SEQUENCE IF NOT EXISTS public.student_id_seq
    INCREMENT 1
    START 1000
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

ALTER SEQUENCE public.student_id_seq
    OWNED BY public.student.student_id;

ALTER SEQUENCE public.student_id_seq
    OWNER TO postgres;