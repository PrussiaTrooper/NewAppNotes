package com.example.newappnotes.pruss.database.room

import androidx.lifecycle.LiveData
import com.example.newappnotes.pruss.database.DatabaseRepository
import com.example.newappnotes.pruss.models.AppNote

class AppRoomRepository(private val appRoomDao: AppRoomDao):DatabaseRepository {

    override val allNotes: LiveData<List<AppNote>>
        get() = TODO("Not yet implemented")

    override suspend fun insert(note: AppNote, onSuccess: () -> Unit) {
        TODO("Not yet implemented")
    }

    override suspend fun delete(note: AppNote, onSuccess: () -> Unit) {
        TODO("Not yet implemented")
    }
}