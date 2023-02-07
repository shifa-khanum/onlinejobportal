package com.cg.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**************************************************************************************
 * @author       Mohamed kather 
 * Description : This is the Entity class for Admin module. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long adminId;
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
	private String email;
	@NotBlank
	@Column(nullable = false)
	private String password;

}
