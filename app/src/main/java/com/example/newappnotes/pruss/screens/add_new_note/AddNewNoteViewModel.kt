package com.example.newappnotes.pruss.screens.add_new_note

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.newappnotes.pruss.models.AppNote
import com.example.newappnotes.pruss.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddNewNoteViewModel(application: Application):AndroidViewModel(application) /*ввод имени заметки*/{
  /*Вставка заметки в базу данных*/
  fun insert(note:AppNote,onSuccsess:()-> Unit) =
          /*Запуск функции в отдельной корунтине*/
          viewModelScope.launch(Dispatchers.IO) {
              REPOSITORY.insert(note){//корунтина
                  onSuccsess()
              }
          }
}