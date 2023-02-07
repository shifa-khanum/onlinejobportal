package com.cg.jobportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/************************************************************
 * @author sahana Created Date: 23 January, 2023 Description : This is the
 *         Entity class for Job module.
 ************************************************************/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {

	@Id
	@Column(name = "job_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank
	@Column(nullable = false)
	private String jobTitle;
	@NotBlank
	@Column(nullable = false)
	private String jobDescription;
	@Column(nullable = false)
	private Boolean active;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_recruiter_id")
	private Recruiter recruiter;

}
