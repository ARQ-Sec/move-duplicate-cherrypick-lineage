package com.arq.moveduplicatecherrypicklineage.web;

import com.arq.moveduplicatecherrypicklineage.dto.RefundResponse;
import com.arq.moveduplicatecherrypicklineage.service.RefundService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/refund")
public class RefundController {
    private final RefundService service;

    public RefundController(RefundService service) {
        this.service = service;
    }

    @GetMapping
    public List<RefundResponse> list() {
        return service.summarize();
    }
}
