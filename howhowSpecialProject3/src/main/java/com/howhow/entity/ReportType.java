package com.howhow.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
@Table(name = "reporttype")
@Entity
public class ReportType {
	
	@GenericGenerator(name = "native", strategy = "native")
	@GeneratedValue(generator = "native")
	@Id @Column(name = "reporttype_id")
	private int reporttype;

	@Column(name = "report_name")
	private String reportname;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "system_time")
	private Date systemtime;

	public int getReporttype() {
		return reporttype;
	}

	public void setReporttype(int reporttype) {
		this.reporttype = reporttype;
	}

	public String getReportname() {
		return reportname;
	}

	public void setReportname(String reportname) {
		this.reportname = reportname;
	}

	public Date getSystemtime() {
		return systemtime;
	}

	public void setSystemtime(Date systemtime) {
		this.systemtime = systemtime;
	}

}