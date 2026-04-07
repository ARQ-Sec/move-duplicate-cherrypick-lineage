package com.arq.moveduplicatecherrypicklineage.service;

import com.arq.moveduplicatecherrypicklineage.dto.DisputeResponse;
import com.arq.moveduplicatecherrypicklineage.repository.DisputeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DisputeService {
    private final DisputeRepository repository;

    public DisputeService(DisputeRepository repository) {
        this.repository = repository;
    }

    public List<DisputeResponse> summarize() {
        return repository.findAll().stream().map(record -> new DisputeResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
