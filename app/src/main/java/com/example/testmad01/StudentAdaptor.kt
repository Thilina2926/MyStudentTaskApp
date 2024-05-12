package com.example.testmad01

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.RecyclerView
import com.example.testmad01.database.Student
import com.example.testmad01.database.StudentRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class StudentAdaptor(items:List<Student>, repository: StudentRepository, viewModel: MainActivityData) : RecyclerView.Adapter<StudentViewHolder>(){

    var context : Context? = null
    val items = items
    val repository = repository
    val viewModel = viewModel


    private val colors = arrayOf("#E1BEE7","#D1C4E9", "#C5CAE9", "#BBDEFB", "#B3E5FC", "#B2EBF2", "#B2DFDB", "#C8E6C9")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.a_student_record,parent,false)
        context = parent.context
        return StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
      return  items.size
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {

        val record = items[position]
        val color = colors[position % colors.size]
        holder.showID.text = "Student ID :  ${record.SID}"
        holder.showName.text = "Student Name :  ${record.name}"
//        holder.showFac.text = "Student Faculty :  ${record.faculty}"
//        holder.showYear.text = "Student Year :  ${record.year}"
        holder.showTask.text = "Student Task :  ${record.task}"
        holder.deleteBTN.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                repository.delete(record)
            }
            notifyDataSetChanged()
        }
        holder.editBTN.setOnClickListener {

        }
        holder.layout.setBackgroundColor(Color.parseColor(color))
    }


}