package com.itau.agro.service;

import com.itau.agro.model.Debt;
import com.itau.agro.repository.DebtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DebtServiceImpl implements DebtService {
    @Autowired
    private DebtRepository debtRepository;

    @Override
    public Debt save(Debt debt) {
        return debtRepository.save(debt);
    }

    @Override
    public List<Debt> findAll() {
        return debtRepository.findAll();
    }

    @Override
    public Optional<Debt> findById(Long id) {
        return debtRepository.findById(id);
    }

    @Override
    public Debt update(Debt debt) {
        return debtRepository.save(debt);
    }
}
