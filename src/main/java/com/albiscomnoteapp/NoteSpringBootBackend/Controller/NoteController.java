package com.albiscomnoteapp.NoteSpringBootBackend.Controller;

import com.albiscomnoteapp.NoteSpringBootBackend.Domain.Note;
import com.albiscomnoteapp.NoteSpringBootBackend.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/notes")
    public ResponseEntity<List< Note>> getAllNotes (){
        return new ResponseEntity<>(noteRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("notes")
    public ResponseEntity<Note> saveSingleNote(  @RequestBody Note note){
        return new ResponseEntity<Note>(noteRepository.save(note), HttpStatus.CREATED);
    }

    @GetMapping("/notes/{id}")
    public ResponseEntity<Note> getSingleNote (@PathVariable("id") Long id){
        return new ResponseEntity<Note>(noteRepository.findById(id).get(), HttpStatus.OK);
    }

}
