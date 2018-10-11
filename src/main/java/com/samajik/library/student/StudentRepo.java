package com.samajik.library.student;

import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {


}
