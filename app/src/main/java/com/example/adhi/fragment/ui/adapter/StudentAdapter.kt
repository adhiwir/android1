package com.example.adhi.fragment.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.adhi.fragment.R
import com.example.adhi.fragment.model.Student
import kotlinx.android.synthetic.main.item_student.view.*

class StudentAdapter(private val studentList: List<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val itemView: View = inflater.inflate(R.layout.item_student, viewGroup, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = studentList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(studentList[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(student: Student){
            itemView.tvName.text = student.name
            itemView.tvEmail.text = student.name
            student.imgAvatar?.let {
                itemView.imgAvatar.setImageResource(it)
            }
        }
    }
}
