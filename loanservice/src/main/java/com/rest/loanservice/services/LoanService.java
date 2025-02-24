package com.rest.loanservice.services;

import com.rest.loanservice.entities.Loan;
import com.rest.loanservice.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    /**
     * Retrieves all loans from the database.
     *
     * @return a list of loans.
     */
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
