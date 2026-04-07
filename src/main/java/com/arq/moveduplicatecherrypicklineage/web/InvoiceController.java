package com.arq.moveduplicatecherrypicklineage.web;

import com.arq.moveduplicatecherrypicklineage.dto.InvoiceResponse;
import com.arq.moveduplicatecherrypicklineage.service.InvoiceService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
    private final InvoiceService service;

    public InvoiceController(InvoiceService service) {
        this.service = service;
    }

    @GetMapping
    public List<InvoiceResponse> list() {
        return service.summarize();
    }
}
