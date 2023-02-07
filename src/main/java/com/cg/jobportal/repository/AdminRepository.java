package com.cg.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	 Admin findByUserName(String userName);

	 boolean existsByUserName(String userName);

}
