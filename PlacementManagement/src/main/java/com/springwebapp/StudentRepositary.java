package com.springwebapp;

import org.springframework.data.jpa.repository.JpaRepository;
/*JPARepositary is exist in Spring data JPA dependencies and it contains
 * all the CRUD operation
 */
public interface StudentRepositary extends JpaRepository<Student,Integer>{

}
