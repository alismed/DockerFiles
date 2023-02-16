package com.itau.agro.service;

import com.itau.agro.model.Debt;

import java.util.List;
import java.util.Optional;

public interface DebtService {

    Debt save(Debt debt);
    List<Debt> findAll();
    Optional<Debt> findById(Long id);
    Debt update(Debt debt);
}
