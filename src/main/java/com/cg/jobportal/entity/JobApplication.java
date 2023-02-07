package com.cg.jobportal.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***********************************************************************
 * @author sahana Created Date: 23 January, 2023 Description : This is the
 *         Entity class for JobApplication module.
 ***********************************************************************/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, length = 50)
	private long id;
	private LocalDateTime appliedDate = LocalDateTime.now();

	@NotBlank
	@Column(nullable = false, length = 50)
	private String coverLetter;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_jobs_id")
	private Job job;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_of_freelancer")
	private Freelancer freelancer;

}
