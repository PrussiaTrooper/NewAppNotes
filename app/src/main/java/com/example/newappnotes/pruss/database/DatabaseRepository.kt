package com.example.newappnotes.pruss.database

import androidx.lifecycle.LiveData
import com.example.newappnotes.pruss.models.AppNote

interface DatabaseRepository {
    val allNotes:LiveData<List<AppNote>>
    suspend fun insert(note: AppNote,onSuccess: ()->Unit)
    suspend fun delete(note: AppNote,onSuccess: ()->Unit)
}