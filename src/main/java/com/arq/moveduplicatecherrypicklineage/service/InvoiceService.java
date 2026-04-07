package com.arq.moveduplicatecherrypicklineage.service;

import com.arq.moveduplicatecherrypicklineage.dto.InvoiceResponse;
import com.arq.moveduplicatecherrypicklineage.repository.InvoiceRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final InvoiceRepository repository;

    public InvoiceService(InvoiceRepository repository) {
        this.repository = repository;
    }

    public List<InvoiceResponse> summarize() {
        return repository.findAll().stream().map(record -> new InvoiceResponse(record.getId(), "ACTIVE", record.getOwner())).toList();
    }
}
