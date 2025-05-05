package com.example.vertragsservice.controller;

import com.example.vertragsservice.model.Contract;
import com.example.vertragsservice.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private ContractRepository contractRepository;

    @GetMapping
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    @PostMapping
    public Contract createContract(@RequestBody Contract contract) {
        return contractRepository.save(contract);
    }
}
