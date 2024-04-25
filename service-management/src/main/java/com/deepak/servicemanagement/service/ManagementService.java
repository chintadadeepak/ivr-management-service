package com.deepak.servicemanagement.service;

import com.deepak.servicemanagement.dao.ManagementRepository;
import com.deepak.servicemanagement.models.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManagementService {
    @Autowired
    private ManagementRepository repository;
    public ResponseEntity<Campaign> makeRequestToProvider(Campaign campaign) {
        return new ResponseEntity<>(repository.save(
                new Campaign(
                        campaign.getCallerId(),
                        campaign.getCampaignType(),
                        campaign.getName(),
                        campaign.getUid(),
                        campaign.getEndTime(),
                        campaign.getCustomerNumber(),
                        campaign.getSendTime()
                )
        ), HttpStatus.CREATED);
    }
    public ResponseEntity<Optional<Campaign>> getStatus(Integer campaignId) {
        return new ResponseEntity<>(repository.findById(campaignId), HttpStatus.OK);
    }
}
