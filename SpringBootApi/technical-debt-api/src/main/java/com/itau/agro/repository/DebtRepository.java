package com.itau.agro.repository;

import com.itau.agro.model.Debt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtRepository extends JpaRepository<Debt, Long>  {
}
