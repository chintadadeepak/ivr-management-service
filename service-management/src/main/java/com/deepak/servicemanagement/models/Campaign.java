package com.deepak.servicemanagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer campaignId;
    private String name;
    private String callerId;

    public Campaign(String name, String callerId, String customerNumber, String campaignType, String uid, String sendTime, String endTime) {
        this.name = name;
        this.callerId = callerId;
        this.customerNumber = customerNumber;
        this.campaignType = campaignType;
        this.uid = uid;
        this.sendTime = sendTime;
        this.endTime = endTime;
    }

    private String customerNumber;
    private String campaignType;
    private String uid;
    private String sendTime;
    private String endTime;
}
