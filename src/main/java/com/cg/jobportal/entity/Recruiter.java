package com.cg.jobportal.entity;

/*********************************************************************
 * @author vedavyas
 * Created Date: 23 January, 2023 
 * Description : This is the Entity class for Recruiter module.
 *********************************************************************/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruiter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recruiter_id")
	private long id;
	@NotBlank
	@Column(nullable = false)
	private String firstName;
	@NotBlank
	@Column(nullable = false)
	private String lastName;
	@NotBlank
	@Column(nullable = false)
	private String userName;
	@NotBlank
	@Column(nullable = false)
	private String password;

}