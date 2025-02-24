CREATE TABLE Loans (
    Loan_ID INT AUTO_INCREMENT PRIMARY KEY,
    User_ID INT,  -- Stores the user's ID
    Book_ID INT,  -- Stores the book's ID
    Loan_Date TIMESTAMP,
    Estimated_Return_Date TIMESTAMP,
    Actual_Return_Date TIMESTAMP
);