package com.harian.noteapp.database

import androidx.lifecycle.LiveData
import com.harian.noteapp.models.Note
import java.lang.NullPointerException

class NotesRepository(private val noteDao: INoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note) {
        return noteDao.insert(note)
    }

    suspend fun delete(note: Note) {
        return noteDao.delete(note)
    }

    suspend fun update(note: Note) {
        return noteDao.update(note.id, note.title, note.note)
    }
}