package com.springboot;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.springboot.entities.Student;
import com.springboot.repository.StudentRepo;

@SpringBootApplication // This is essential
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepo studentRepo = context.getBean(StudentRepo.class);

		
		/*
		 * Student st = new Student(); st.setStudName("Ranjana");
		 * st.setStudAddr("Solapur"); studentRepo.save(st);
		 */
		 

		// List<Student> list = (List<Student>) studentRepo.findAll();

		// list.forEach(student->System.out.println(student));

		/*
		 * Student stud = studentRepo.findById(3).get(); System.out.println(stud);
		 */

		/*
		 * stud.setStudName("Ranjana"); stud.setStudAddr("Madha");
		 * studentRepo.save(stud);
		 * 
		 * System.out.println(stud); System.out.println("Updated Successfully...!");
		 */

		/*
		 * studentRepo.delete(stud); System.out.println("Deleted SUccessfully...!");
		 */
		 
		/*
		 * Student stud = studentRepo.findByStudName("Ravindra");
		 * 
		 * System.out.println(stud);
		 * 
		 * stud = studentRepo.findById(5).get(); System.out.println(stud);
		 * stud.setStudName("Samarth"); stud.setStudAddr("Madha");
		 * studentRepo.save(stud); System.out.println(stud);
		 * 
		 * stud = studentRepo.findById(6).get(); System.out.println(stud);
		 * stud.setStudName("Devansh"); stud.setStudAddr("Kolapur");
		 * studentRepo.save(stud); System.out.println(stud);
		 * 
		 * stud = studentRepo.findByStudAddr("Madha"); System.out.println(stud);
		 */
		
		/*
		 * Student stud = studentRepo.findByStudNameAndStudAddr("Ravindra", "Pune");
		 * System.out.println(stud);
		 */
		/*
		 * List<Student> stud = studentRepo.findByOrderByStudNameDesc();
		 * stud.forEach(e->System.out.println(e));
		 */
		
		/*
		 * Student s = studentRepo.getByStudNameAndStudAddr("Ravindra", "Pune");
		 * System.out.println(s);
		 */
		
		//Pagination
		PageRequest pageable = PageRequest.of(1, 3);
		Page<Student> page =  studentRepo.findAll(pageable);
		page.get().forEach(e->System.out.println(e));
		System.out.println("Size : " + page.getSize());
		System.out.println("Count : " + page.getTotalPages());
		
		
		//Sorting
		Sort sort = Sort.by("studName").ascending();
		List<Student> stud = studentRepo.findAll(sort);
		System.out.println("------------------| Student Details After Sorting |-------------------");
		stud.forEach(e->System.out.println(e));
		System.out.println("----------------------------------------------------------------------");
	}
}
