package com.rest.loanservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "Loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Loan_ID")
    private Integer loanId;

    @Column(name = "User_ID", nullable = false)
    private Integer userId;

    @Column(name = "Book_ID", nullable = false)
    private Integer bookId;

    @Column(name = "Loan_Date", nullable = false)
    private LocalDateTime loanDate;

    @Column(name = "Estimated_Return_Date", nullable = false)
    private LocalDateTime estimatedReturnDate;

    @Column(name = "Actual_Return_Date")
    private LocalDateTime actualReturnDate;

    // Constructors
    public Loan() {}

    public Loan(Integer userId, Integer bookId, LocalDateTime loanDate, LocalDateTime estimatedReturnDate, LocalDateTime actualReturnDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.loanDate = loanDate;
        this.estimatedReturnDate = estimatedReturnDate;
        this.actualReturnDate = actualReturnDate;
    }

    // Getters and Setters
    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getEstimatedReturnDate() {
        return estimatedReturnDate;
    }

    public void setEstimatedReturnDate(LocalDateTime estimatedReturnDate) {
        this.estimatedReturnDate = estimatedReturnDate;
    }

    public LocalDateTime getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(LocalDateTime actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }
}
