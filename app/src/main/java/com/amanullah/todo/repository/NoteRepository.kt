package com.amanullah.todo.repository

import androidx.lifecycle.LiveData
import com.amanullah.todo.model.Note
import com.amanullah.todo.database.NotesDao

class NoteRepository(private val notesDao: NotesDao) {

    val allNotes: LiveData<List<Note>> = notesDao.getAllNotes()

    suspend fun insert(note: Note) { notesDao.insert(note) }

    suspend fun delete(note: Note){ notesDao.delete(note) }

    suspend fun update(note: Note){ notesDao.update(note) }
}