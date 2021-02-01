package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.entity.CoPdfs;

public interface CoPdfsRepo extends JpaRepository<CoPdfs, Serializable> {

}
