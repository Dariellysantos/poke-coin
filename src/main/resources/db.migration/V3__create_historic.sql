CREATE TABLE public.historic(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    sales VARCHAR(60) NULL,
    acquisition VARCHAR(60) NULL,
    CONSTRAINT "PK_a3ffb1c0c8416b9fc6f907b7437" PRIMARY KEY (id)
    )