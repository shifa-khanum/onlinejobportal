package com.cg.jobportal.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
/**************************************************************************************
 * @author       Vedavyas 
 * Description : This is the Entity class for Bookmarked Job module. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkedJob {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookmarked_id")
	private Long id;


	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_freelancer_id")
	private Freelancer freelancer;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_jobs_id")
	private Job job;

	
	
	
}