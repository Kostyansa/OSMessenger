CREATE TABLE IF NOT EXISTS "user"(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    password TEXT NOT NULL,
    image TEXT,
    description TEXT
);

CREATE TABLE IF NOT EXISTS "group"(
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    description TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS "message"(
    id SERIAL PRIMARY KEY,
    "text" TEXT NOT NULL,
    "timestamp" TIMESTAMP NOT NULL,
    user_id INT NOT NULL REFERENCES "user"(id),
    group_id INT NOT NULL REFERENCES "group"(id)
);

CREATE TABLE IF NOT EXISTS "user_in_group"(
    user_id INT NOT NULL REFERENCES "user"(id),
    group_id INT NOT NULL REFERENCES "group"(id)
);