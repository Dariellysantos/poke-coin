CREATE TABLE public.pokemons(
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    name VARCHAR(60) NULL,
    level VARCHAR(60) NULL,
    experience VARCHAR(60) NULL,
    CONSTRAINT "PK_a3ffb1c0c8416b9fc6f907b7439" PRIMARY KEY (id)
    )