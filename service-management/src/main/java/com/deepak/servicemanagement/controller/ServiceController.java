package com.deepak.servicemanagement.controller;

import com.deepak.servicemanagement.models.Campaign;
import com.deepak.servicemanagement.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ServiceController {

    @Autowired
    private ManagementService service;
    @PostMapping("call")
    public ResponseEntity<Campaign> makeARequestToProvider(@RequestBody Campaign campaign) {
        return service.makeRequestToProvider(campaign);
    }

    @GetMapping("get-status/{id}")
    public ResponseEntity<Optional<Campaign>> getStatus(@PathVariable Integer id) {
        return service.getStatus(id);
    }

}
