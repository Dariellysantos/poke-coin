CREATE TABLE account(
id uuid NOT NULL DEFAULT uuid_generate_v4(),
email VARCHAR(60) NOT NULL,
"catalog" VARCHAR(60) NULL,
recipe VARCHAR(60) NULL,
historic VARCHAR(60) NULL,
wallet VARCHAR(60) NULL,
updated_at timestamp NOT NULL DEFAULT now(),
created_at timestamp NOT NULL DEFAULT now(),
CONSTRAINT "PK_a3ffb1c0c8416b9fc6f907b7433" PRIMARY KEY (id)
);