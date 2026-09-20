INSERT INTO products
(name, category, product_type, price, stock_quantity, requires_prescription, created_at, updated_at, description)
VALUES
    ('Paracetamol 500mg',
     'Pain Relief',
     'Tablet',
     25.50,
     100,
     false,
     CURRENT_TIMESTAMP,
     CURRENT_TIMESTAMP,
     'Paracetamol tablets for fever and mild pain.');

INSERT INTO products
(name, category, product_type, price, stock_quantity, requires_prescription, created_at, updated_at, description)
VALUES
    ('Amoxicillin 500mg',
     'Antibiotics',
     'Capsule',
     120.00,
     50,
     false,
     CURRENT_TIMESTAMP,
     CURRENT_TIMESTAMP,
     'Amoxicillin capsules.');

INSERT INTO products
(name, category, product_type, price, stock_quantity, requires_prescription, created_at, updated_at, description)
VALUES
    ('Cetirizine 10mg',
     'Allergy',
     'Tablet',
     45.00,
     75,
     false,
     CURRENT_TIMESTAMP,
     CURRENT_TIMESTAMP,
     'Antihistamine tablets for allergy symptoms.');

INSERT INTO products
(name, category, product_type, price, stock_quantity, requires_prescription, created_at, updated_at, description)
VALUES
    ('Omeprazole 20mg',
     'Gastrointestinal',
     'Capsule',
     65.00,
     80,
     false,
     CURRENT_TIMESTAMP,
     CURRENT_TIMESTAMP,
     'Medicine used to reduce stomach acid.');

INSERT INTO products
(name, category, product_type, price, stock_quantity, requires_prescription, created_at, updated_at, description)
VALUES
    ('Vitamin D3 1000 IU',
     'Vitamins',
     'Supplement',
     150.00,
     60,
     false,
     CURRENT_TIMESTAMP,
     CURRENT_TIMESTAMP,
     'Vitamin D3 supplement.');

INSERT INTO orders
(id, order_date, total_amount, status, customer_id)
VALUES
    (1, CURRENT_TIMESTAMP, 200.00, 'Pending', 10001);

INSERT INTO orders
(id, order_date, total_amount, status, customer_id)
VALUES
    (2, CURRENT_TIMESTAMP, 150.00, 'Completed', 10002);

INSERT INTO customers
(id, name, email, phone_number)
VALUES
    (10001, 'John Doe', 'john.doe@example.com', '123-456-7890');

INSERT INTO customers
(id, name, email, phone_number)
VALUES
    (10002, 'Jane Smith', 'jane.smith@example.com', '098-765-4321');

INSERT INTO cart_items
(id, customer_id, product_ids)
VALUES
    (101, 10001, ARRAY[1,2]);

INSERT INTO stores
(id, name, location, pin_code)
VALUES
    (1, 'HealthPlus Pharmacy', '123 Main St, Cityville', '535501');

INSERT INTO stores
(id, name, location, pin_code)
VALUES
    (2, 'Wellness Pharmacy', '456 Elm St, Townsville', '535502');

INSERT INTO coupons
(id, code, discount_rate, expiration_date, is_active)
VALUES
    (1, 'SUMMER2023', 0.20, '2026-12-31', true);

INSERT INTO coupons
(id, code, discount_rate, expiration_date, is_active)
VALUES
    (2, 'WELCOME10', 0.10, '2023-10-30', true);