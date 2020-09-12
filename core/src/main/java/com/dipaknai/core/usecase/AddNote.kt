package com.dipaknai.core.usecase

import com.dipaknai.core.data.Note
import com.dipaknai.core.repository.NoteRepository

class AddNote(private val noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.addNote(note)
}