package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.BatchSummary;

public interface BatchSummaryRepo extends JpaRepository<BatchSummary, Serializable> {

}
