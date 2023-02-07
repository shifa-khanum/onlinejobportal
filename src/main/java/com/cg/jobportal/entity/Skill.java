package com.cg.jobportal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/****************************************************************
 * 
 * @author sangeetha Created Date: 23 January, 2023 Description : This is the
 *         Entity class for Skill module.
 *
 ****************************************************************/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long skillId;

	@NotBlank
	@Column(nullable = false)
	private String title;
	@NotBlank
	@Column(nullable = false)
	private String description;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id_freelancer")
	private Freelancer freelancer;

}
