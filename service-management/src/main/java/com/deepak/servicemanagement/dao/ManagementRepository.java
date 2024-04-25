package com.deepak.servicemanagement.dao;

import com.deepak.servicemanagement.models.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagementRepository extends JpaRepository<Campaign, Integer> {
}
