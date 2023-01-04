package com.albiscomnoteapp.NoteSpringBootBackend.Repository;

import com.albiscomnoteapp.NoteSpringBootBackend.Domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
