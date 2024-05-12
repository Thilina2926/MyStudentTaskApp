package com.example.testmad01

import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentViewHolder(view: View): RecyclerView.ViewHolder(view) {
   // val cbTodo: CheckBox = view.findViewById(R.id.cbTodo)
   // val ivDelete : ImageView =view.findViewById(R.id.ivDelete)
    val showID : TextView  =view.findViewById(R.id.textViewSIDShow)
    val showName : TextView  =view.findViewById(R.id.textViewNameShow)
    val showFac : TextView  =view.findViewById(R.id.textViewFacultyShow)
    val showYear : TextView  =view.findViewById(R.id.textViewYearShow)
    val showTask : TextView  =view.findViewById(R.id.textViewshowtask)
    val layout : LinearLayout = view.findViewById(R.id.recordLayout)
    val deleteBTN : Button = view.findViewById(R.id.buttonDeleteRecord)
    val editBTN : Button = view.findViewById(R.id.buttonEditRecord)

}
