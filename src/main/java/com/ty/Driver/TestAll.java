package com.ty.Driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qsp.multiple_bean_conf.Staff;
import com.ty.multiple_bean_conf.Student;
import com.ty.multiple_bean_conf.Teacher;

public class TestAll {

   public static void main(String[] args) {
	
	ApplicationContext appCont=new ClassPathXmlApplicationContext("my_college.xml");
	Student student=(Student) appCont.getBean("myStudent");
	student.run();
	
	Teacher teacher=(Teacher) appCont.getBean("myTeacher");
	teacher.teach();
	
	Staff staff=(Staff)appCont.getBean("myStaff");
	staff.work();
	
   }
	
	
}