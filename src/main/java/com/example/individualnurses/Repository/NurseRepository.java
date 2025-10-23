package com.example.individualnurses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.individualnurses.Entity.Nurse;


@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
	
}
