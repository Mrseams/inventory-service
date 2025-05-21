ALTER TABLE t_inventory ADD COLUMN quantity INT(100) DEFAULT 0 NOT NULL;
INSERT INTO t_inventory(quantity, sku_code)
    values (100, "pixel_9"),
           (100, "pixel_8"),
           (100, "pixel_7"),
           (100, "pixel_6"),
           (100, "pixel_5"),
           (100, "pixel_4");