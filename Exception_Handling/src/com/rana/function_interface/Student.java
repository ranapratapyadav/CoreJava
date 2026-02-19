package com.rana.function_interface;

public record Student(Integer id,String name,Double marks) implements Comparable<Student>
{
	
	public int compareTo(Student e2)
	{
		return  this.id-e2.id;
		
	}

}
