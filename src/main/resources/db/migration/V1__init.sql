CREATE TABLE t_order
(
    id               BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
    order_number     VARCHAR(255) NOT NULL,
    sku_code         VARCHAR(255) NOT NULL,
    price            DECIMAL(19, 2) NOT NULL,
    quantity         INT(11) NOT NULL,
    created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);