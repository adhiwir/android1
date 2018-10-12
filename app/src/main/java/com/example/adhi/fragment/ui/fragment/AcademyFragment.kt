package com.example.adhi.fragment.ui.fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.adhi.fragment.R
import com.example.adhi.fragment.model.Student
import com.example.adhi.fragment.ui.activity.StudentDetailActivity
import com.example.adhi.fragment.ui.adapter.StudentAdapter
import kotlinx.android.synthetic.main.fragment_academy.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class AcademyFragment : Fragment() {

    companion object {
        const val STUDENT = "student"
    }

    private val studentsList = mutableListOf<Student>()
    private  lateinit var studentAdapter: StudentAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_academy, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        studentAdapter = StudentAdapter(studentsList) {student ->
            val toStudentDetail = Intent(context, StudentDetailActivity::class.java)
            toStudentDetail.putExtra(STUDENT, student)
            startActivity(toStudentDetail)
        }

        /**
         * layout manager :
         * 1. Horizontal : LinearLayoutManager(context, LinearLayoutmanager.HORIZONTAL, false)
         * 2. Vertical : LinearLayoutmanager(context)
         * 3. Grid : GridLayoutManager(context, 3) -> 3 column
         */

        /**
        view.rvStudents.layoutManager = LinearLayoutManager(context)
        view.rvStudents.adapter = studentAdapter
        */

        view.rvStudents.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = studentAdapter
        }

        getDataStudent()
    }

    private fun getDataStudent() {
        studentsList.add(Student(
                id = "001",
                name = "Adhi Wirianata",
                email = "adhiwirianata@gmail.com",
                imgAvatar = R.mipmap.ic_launcher
        ))
        studentsList.add(Student(
                id = "002",
                name = "Reza R",
                email = "reza.r@gmail.com",
                imgAvatar = R.mipmap.ic_launcher
        ))
        studentsList.add(Student(
                id = "003",
                name = "Ronald Yosua",
                email = "yosuaronald@gmail.com",
                imgAvatar = R.mipmap.ic_launcher
        ))
        studentsList.add(Student(
                id = "004",
                name = "Rex Luhut",
                email = "r.luhut@gmail.com",
                imgAvatar = R.mipmap.ic_launcher
        ))
        studentsList.add(Student(
                id = "005",
                name = "Eki J",
                email = "jehabut.eki@gmail.com",
                imgAvatar = R.mipmap.ic_launcher
        ))
        (0..10).forEach {
            studentsList.add(Student(
                    id = "$it",
                    name = "Siswa ${it.plus(1)}",
                    email = "siswa ${it.plus(1)}@gmail.com",
                    imgAvatar = R.mipmap.ic_launcher
            ))
        }

        studentAdapter.notifyDataSetChanged()
    }

}
