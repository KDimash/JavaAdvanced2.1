package kz.aitu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import kz.aitu.repository.StudentsRepository;

@RestController
public class StudentsController {
    private final StudentsRepository studentRepository;

    public StudentsController(StudentsRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/api")
    public ResponseEntity<?> getStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }
}
