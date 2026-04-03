create table if not exists items(
    id BIGSERIAL primary key,
    name varchar(255) not null,
    category varvhar(100) not null,
    price numeric(10,2) not null,
    stock_quantity integer not null
);

insert into items(name, category, price, stock_quantity)
values
    ('Wireless Mouse', 'Electronics', 25.99,10),
    ('Mechanical Keyboard', 'Electronics', 89.50,5),
    ('Notebook', 'Stationery', 3.25,100);