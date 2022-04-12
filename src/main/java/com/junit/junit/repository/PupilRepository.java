package com.junit.junit.repository;

import com.junit.junit.entity.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PupilRepository extends JpaRepository <Pupil, Long>{

}
