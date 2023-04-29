package basicJava;

import java.util.Arrays;
import java.util.Scanner;

public class TestStudent {
	Student stud[] = new Student[11];
	Scanner sc = new Scanner(System.in);

	void StudentData() {

		/*
		 * for(int i=0;i<stud.length;i++) {
		 * System.out.println("Enter id,name,department and marks"); int
		 * id=sc.nextInt(); String name=sc.next(); String dept=sc.next(); int
		 * marks=sc.nextInt(); Student s=new Student(id,name,dept,marks); stud[i]=s;
		 */

		stud[0] = new Student(12, "Raj", "Computer", 70);
		stud[1] = new Student(120, "Riya", "Computer", 56);
		stud[2] = new Student(1, "Arjun", "Civil", 70);
		stud[3] = new Student(45, "Karan", "ENTC", 60);
		stud[4] = new Student(23, "Rahul", "Computer", 60);
		stud[5] = new Student(5, "Anjali", "Computer", 65);
		stud[6] = new Student(78, "Riya", "ENTC", 50);
		stud[7] = new Student(167, "Ramesh", "Mechanical", 55);
		stud[8] = new Student(50, "Suresh", "Mechanical", 60);
		stud[9] = new Student(145, "Nilima", "Civil", 70);
	}

	public void operation() {
		System.out.println("Choose\n 1)Add Student Data\n 2)Search a data\n 3)Delete data\n 4)Update the data");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			addStudentData();
			break;
		case 2:
			searchData();
			break;
		case 3:
			deleteData();
			break;
		case 4:
			updateData();
			break;

		}
		display1();
	}

	public void display() {
		System.out.println(Arrays.toString(stud));

	}

	public void display1() {
		for (int i = 0; i < stud.length; i++) {
			System.out.println(stud[i]);
		}
	}

	public void addStudentData() {
		for (int i = 0; i < stud.length; i++) {
			if (stud[i] == null) {
				System.out.println("Enter id,name,department and marks of Students");
				int id = sc.nextInt();
				String name = sc.next();
				String dept = sc.next();
				int marks = sc.nextInt();
				Student s = new Student(id, name, dept, marks);
				stud[i] = s;
				break;

			}
		}

	}

	public void searchData() {
		System.out.println("Enter the student id:");
		int id = sc.nextInt();
		if (stud != null) {
			for (Student s : stud) {
				if (s.id == id) {
					System.out.println(s);
				}

			}
		}

	}

	public void deleteData() {
		System.out.println("Enter the student id for deleting the data ");
		int id = sc.nextInt();
		for (int i = 0; i < stud.length; i++) {
			if (stud[i] != null) {
				if (stud[i].id == id) {
					stud[i] = null;
					break;
				}
			}
		}
	}

	public void updateData() {
		System.out.println("Enter the student id for updating marks:");
		int id = sc.nextInt();
		System.out.println("What do u want to update:(marks)");
		String data = sc.next();
		if (data.equalsIgnoreCase("marks")) {
			System.out.println("Enter the new marks: ");
			int m = sc.nextInt();
			for (Student s : stud) {
				if (s != null) {
					if (s.id == id) {
						s.marks = m;
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		TestStudent t = new TestStudent();
		t.StudentData();
		t.display1();
		// t.display1();
		// t.addStudentData();
		// t.display1();
		// t.deleteData();
		// t.display1();
		// t.updateData();
		// t.display1();
		t.operation();

	}

}