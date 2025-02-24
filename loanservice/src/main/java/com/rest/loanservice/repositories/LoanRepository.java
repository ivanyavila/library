package com.rest.loanservice.repositories;

import com.rest.loanservice.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
    // Additional query methods can be defined here if needed
}

