package com.cg.jobportal.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
/**************************************************************************************
 * @author       Mohamed kather 
 * Description : This is the Entity class for Feedback module. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {

	@Id
	@GeneratedValue
	long id;

	@Min(1)
	@Max(10)
	@Column(nullable = false)
	int ranges;
	
	@NotBlank
	@Length(max = 50)
	@Column(nullable = false)
	String comments;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_recruiter")
	private Recruiter recruiter;

}
