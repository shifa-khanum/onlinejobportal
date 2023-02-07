package com.cg.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Recruiter;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter, Long>{

}
