package com.hib.hib_springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="student_test")
public class Student {
	
	@Id
	@Column(name="std_id")
	private String id;
	
	@Column(name="roll_no")
	private String rollno;
	
	@Transient
	private String temp;

}
