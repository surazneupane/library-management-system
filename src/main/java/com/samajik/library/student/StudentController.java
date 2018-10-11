package com.samajik.library.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/students")
    public List<StudentEntity> getAllStudents()
    {

return studentRepo.findAll();

    }

@GetMapping("/students/{id}")

    public StudentEntity getStudentById(@PathVariable Integer id){
//returning StudentEntity obj due to return type
   Optional< StudentEntity> studentEntity=studentRepo.findById(id);
  //return all the getters of that id
   return studentEntity.get();

}

@DeleteMapping("/students/{id}")
public void deleteStudentbyId(@PathVariable Integer id)
{

    studentRepo.deleteById(id);

}

@PostMapping("/students")

//because we need student entity type input
    public void insertStudent(@RequestBody StudentEntity studentEntity)
{

studentRepo.save(studentEntity);

}

@PutMapping("/students/{id}")
public void updateStudent(@RequestBody StudentEntity studentEntity,@PathVariable Integer id)
{
    studentEntity.setLibraryId(id);
    studentRepo.save(studentEntity);

}
}
