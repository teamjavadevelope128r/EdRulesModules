package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.BatchRunDtls;

public interface BatchRunDtlsRepo extends JpaRepository<BatchRunDtls, Serializable> {

}
