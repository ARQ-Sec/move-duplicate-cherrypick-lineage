package com.arq.moveduplicatecherrypicklineage.service;

import com.arq.moveduplicatecherrypicklineage.dto.LedgerResponse;
import com.arq.moveduplicatecherrypicklineage.repository.LedgerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LedgerService {
    private final LedgerRepository repository;

    public LedgerService(LedgerRepository repository) {
        this.repository = repository;
    }

    public List<LedgerResponse> summarize() {
        return repository.findAll().stream().map(record -> new LedgerResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
