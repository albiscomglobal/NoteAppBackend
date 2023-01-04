package com.albiscomnoteapp.NoteSpringBootBackend.Repository;

import com.albiscomnoteapp.NoteSpringBootBackend.Domain.Note;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoteRepositoryTest {

    @Autowired
    private NoteRepository noteRepository;

    @Test
    public void saveNote(){

        Note note = Note.builder()
                .body("We are getting the mandate now")
                .category("mda")
                .title("Salary Mandate")
                .build();
        noteRepository.save(note);
    }

}