CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    is_account_locked BOOLEAN DEFAULT FALSE,
    lock_time DATETIME,
    failed_login_attempts INT DEFAULT 0
);
