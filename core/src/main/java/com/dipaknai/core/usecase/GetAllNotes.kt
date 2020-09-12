package com.dipaknai.core.usecase

import com.dipaknai.core.repository.NoteRepository

class GetAllNotes(private val noteRepository: NoteRepository)  {
    suspend operator fun invoke() = noteRepository.getAllNotes()
}