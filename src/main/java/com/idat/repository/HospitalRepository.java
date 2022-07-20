package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
