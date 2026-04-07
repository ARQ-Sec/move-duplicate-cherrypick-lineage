package com.arq.moveduplicatecherrypicklineage.web;

import com.arq.moveduplicatecherrypicklineage.dto.SettlementResponse;
import com.arq.moveduplicatecherrypicklineage.service.SettlementService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/settlement")
public class SettlementController {
    private final SettlementService service;

    public SettlementController(SettlementService service) {
        this.service = service;
    }

    @GetMapping
    public List<SettlementResponse> list() {
        return service.summarize();
    }
}
