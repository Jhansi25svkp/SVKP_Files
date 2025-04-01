package org.tnsif.capgemini.c2tc.Interface;

public class MarkerDemo {


	
		
		public interface Registerable {
		}

		public class Student implements Registerable {
		    int id;
		    String name;
		    int fees;
		    String course;

		    public Student(int id, String name, int fees, String course) {
		        this.id = id;
		        this.name = name;
		        this.fees = fees;
		        this.course = course;
		    }
		}
}
		

