package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.EdEligibilityDetails;

public interface EdEligibilityRepo extends JpaRepository<EdEligibilityDetails, Serializable> {

}
