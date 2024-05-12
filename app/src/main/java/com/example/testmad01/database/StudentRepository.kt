package com.example.testmad01.database

import androidx.lifecycle.LiveData

class StudentRepository(private val db : Studentsdb){
  suspend fun insert(student: Student) = db.getStudentDao().insert(student)
  suspend fun delete(student: Student) = db.getStudentDao().delete(student)
  suspend fun update(student: Student) = db.getStudentDao().updateStudent(student)
  fun getAllTodoItems():List<Student> = db.getStudentDao().getAllStudents()
}