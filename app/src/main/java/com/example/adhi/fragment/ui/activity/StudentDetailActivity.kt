package com.example.adhi.fragment.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.adhi.fragment.R
import com.example.adhi.fragment.model.Student
import com.example.adhi.fragment.ui.fragment.AcademyFragment

class StudentDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val student = intent?.getParcelableExtra<Student>(AcademyFragment.STUDENT)
        this.title=student?.name?.toUpperCase()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
