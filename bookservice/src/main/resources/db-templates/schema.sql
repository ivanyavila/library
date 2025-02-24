CREATE TABLE books (
    book_ID INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author VARCHAR(100),
    ISBN VARCHAR(20),
    genre VARCHAR(50),
    publisher VARCHAR(100),
    available_quantity INT
);