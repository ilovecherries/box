DROP TABLE IF EXISTS comments;
DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS categories;

CREATE TABLE categories (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50)
);

CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(50),
    hashed_password VARCHAR(255),
    salt VARCHAR(255)
);

CREATE TABLE posts (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255),
    content VARCHAR(500),
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    edit_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    author_id BIGINT,
    category_id BIGINT,
    CONSTRAINT author
        FOREIGN KEY(author_id)
            REFERENCES users(id),
    CONSTRAINT category
        FOREIGN KEY(category_id)
            REFERENCES categories(id)
);

CREATE TABLE comments (
    id BIGSERIAL PRIMARY KEY,
    content VARCHAR(500),
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    edit_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    author_id BIGINT,
    post_id BIGINT,
    CONSTRAINT author
        FOREIGN KEY(author_id)
            REFERENCES users(id),
    CONSTRAINT post
        FOREIGN KEY(post_id)
            REFERENCES posts(id)
);