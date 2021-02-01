package com.ashok.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CoTriggers {

	@Id
	private Integer Primary_key;
	private Integer trg_Id;
	private Integer Case_num;
	private Date    Create_date;
	private String  Trg_sts;
	private boolean  Update;
	
}
