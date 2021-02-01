package com.ashok.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EdEligibilityDetails {

	@Id
	private Integer Ed_traceId;
	private Double  Benefit_amt;
	private Integer Case_num;
	private Date    Create_dt;
	private String  Denial_reaseon;
	private String  Plan_end;
	private String  Plan_name;
	private Date    Plan_start;
	private String  Plan_stats;
	private Date    Update_dt;
}
