/*
You are given a list of student information: ID, FirstName, and CGPA. 
Your task is to rearrange them according to their CGPA in decreasing order.
If two student have the same CGPA, then arrange them according to their first name in alphabetical order.
If those two students also have the same first name, then order them according to their ID.
No two students have the same ID.
Sample Input
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
 */
import java.util.*;
import java.util.List;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code


class StudentComparator implements Comparator{  
		public int compare(Object o1,Object o2){  
			Student s1=(Student)o1;  
			Student s2=(Student)o2; 
			
			if(s1.getCgpa()==s2.getCgpa()) {
				if(s1.getFname().equals(s2.getFname())) {
					if(s1.getId()>s2.getId()) {
						return -1;
					}else {
						return 1;
					}	
				}else {
					return s1.getFname().compareTo(s2.getFname());
				}				
			}else if(s1.getCgpa()>s2.getCgpa()) {
				return -1;
			}else {
				return 1;
			}			 
		}  
}  

public class Sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		Collections.sort(studentList, new StudentComparator() );
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}




