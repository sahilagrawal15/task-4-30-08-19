import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> stud = new ArrayList<>();

		System.out.println("Choose any among the following options:");
		System.out.println("1. Add Emp");
		System.out.println("2. View All Employees");
		System.out.println("3. Remove an emp");
		System.out.println("4. Delete all records");
		System.out.println("5. Change Salary");
		System.out.println("6. Search Employee");
		System.out.println("7. View dept wise list");
		System.out.println("-----------------------------------");

		int a;
		a = scan.nextInt();
		switch (a) {
		case 1: {
			System.out.println("Enter empno");
			int empno = scan.nextInt();
			System.out.println("Enter emp name");
			String ename = scan.next();
			System.out.println("Enter emp salary");
			int salary = scan.nextInt();
			System.out.println("Enter emp designation");
			String designation = scan.next();
			System.out.println("Enter emp dept");
			String dept = scan.next();

			Student student = new Student(empno, ename, salary, designation, dept);
			stud.add(student);
			break;
		}
		case 2: {
			System.out.println("Displaying record of all employees");
			for (int i = 0; i < stud.size(); i++) {
				// System.out.println(stud.toArray().toString());
				System.out.println(stud.get(i).toString());
				break;
			}
		}
		case 3: {
			System.out.println("Enter empno for removing its data");
			int eno = scan.nextInt();
			for (int j = 0; j < stud.size(); j++) {
				if (stud.get(j).getEmpno() == eno) {
					stud.remove(j);
				}

			}
			break;
		}
		case 4: {
			System.out.println("Clearing all data");

			stud.clear();
			break;
		}

		case 5: {
			System.out.println("Enter emp no and change salary");
			int em = scan.nextInt();
			for (int p = 0; p < stud.size(); p++) {
				if (stud.get(p).getEmpno() == em) {
					stud.get(p).setSalary(scan.nextInt());
				}

			}
			break;
		}

		case 6: {
			System.out.println("Enter empno for searching");
			int eno2 = scan.nextInt();
			for (int k = 0; k < stud.size(); k++) {
				if (stud.get(k).getEmpno() == eno2)
					System.out.println(stud.get(eno2).toString());
			}
			break;
		}
		case 7: {
			String dnm = scan.next();
			for (int t = 0; t < stud.size(); t++) {
				if (stud.get(t).getDept().equals(dnm)) {
					System.out.println(stud.get(t).toString());
				}
			}
			break;
		}
		case 8: {
			System.out.println("Choose among the following to return data in sorted order");
			System.out.println("1. Return data Emp name wise");
			System.out.println("2. Return data Emp no wise");
			System.out.println("3. Return data salary wise");
			System.out.println("4. Return data Designation wise");
			System.out.println("5. Return data dept wise");

			int m = scan.nextInt();

			switch (m) {
			case 1: {
				System.out.println("Select among the following");
				System.out.println("1. Ascending");
				System.out.println("2. Descending");
				int j=scan.nextInt();
				if(j==1)
				{
				Collections.sort(stud, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {

						return s1.getEname().compareTo(s2.getEname());
					}

				});
				}
				else if(j==2)
				{
					Collections.sort(stud, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {

							return s2.getEname().compareTo(s1.getEname());
						}

					});
				}
				break;
			
			}
			case 2: {
				System.out.println("Select among the following");
				System.out.println("1. Ascending");
				System.out.println("2. Descending");
				int j=scan.nextInt();
				if(j==1)
				{
				Collections.sort(stud, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {

						return s1.getEmpno()-(s2.getEmpno());
					}

				});
				}
				else if(j==2)
				{
					Collections.sort(stud, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {

							return s2.getEmpno()-(s1.getEmpno());
					}
				});
				}
				break;
			}
			case 3: {
				System.out.println("Select among the following");
				System.out.println("1. Ascending");
				System.out.println("2. Descending");
				int j=scan.nextInt();
				if(j==1)
				{
			
				Collections.sort(stud, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {

						return s1.getSalary()-(s2.getSalary());
					}

				});
				}
				else if(j==2)
				{
					Collections.sort(stud, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {

							return s2.getSalary()-(s1.getSalary());
							}
				});
				}
				break;
			}
			case 4: {
				System.out.println("Select among the following");
				System.out.println("1. Ascending");
				System.out.println("2. Descending");
				int j=scan.nextInt();
				if(j==1)
				{
			
				Collections.sort(stud, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {

						return s1.getDesignation().compareTo(s2.getDesignation());
					}

				});
				}
				else if(j==2)
				{
					Collections.sort(stud, new Comparator<Student>() {

						@Override
						public int compare(Student s1, Student s2) {

							return s2.getDesignation().compareTo(s1.getDesignation());
							}
				});
				}
				break;
			}
			case 5: {
				System.out.println("Select among the following");
				System.out.println("1. Ascending");
				System.out.println("2. Descending");
				int j=scan.nextInt();
				if(j==1)
				{
			
				Collections.sort(stud, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {

						return s1.getDept().compareTo(s2.getDept());
					}
					});
				}
				

				
			
			else if(j==2)
			{
				Collections.sort(stud, new Comparator<Student>() {

					@Override
					public int compare(Student s1, Student s2) {

						return s1.getDept().compareTo(s2.getDept());
			}
				
				});
			}
			break;
			}
			

			}
		}

		default:
			System.out.println("Exit");
		}

	
		}
}
