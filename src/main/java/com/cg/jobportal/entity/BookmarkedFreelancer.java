package com.cg.jobportal.entity;


import javax.persistence.CascadeType;
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
 * @author       Shifa Khanam Attar
 * Description : This is the Entity class for Bookmarked Freelancer module. 
 * Created Date: 23 January, 2023 
 * 
 *************************************************************************************/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkedFreelancer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_recruiter_id")
	private Recruiter bookmarkedBy;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_freelancer_id")
	private Freelancer freelancer;
	
}
 