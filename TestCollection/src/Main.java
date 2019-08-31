import java.util.ArrayList;
import java.util.HashMap;
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
		case 1:
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

		case 2:
			System.out.println("Displaying record of all employees");
			for (int i = 0; i < stud.size(); i++) {
				// System.out.println(stud.toArray().toString());
				System.out.println(stud.get(i).toString());
			}
		case 3:
			System.out.println("Enter empno for removing its data");
			int eno = scan.nextInt();
			for (int j = 0; j < stud.size(); j++) {
				if (stud.get(j).getEmpno() == eno) {
					stud.remove(j);
				}

			}
		case 4:
			System.out.println("Clearing all data");

			stud.clear();

		case 5:
			System.out.println("Enter emp no and change salary");
			int em = scan.nextInt();
			for (int p = 0; p < stud.size(); p++) {
				if (stud.get(p).getEmpno() == em) {
					stud.get(p).setSalary(scan.nextInt());
				}

			}

		case 6:
			System.out.println("Enter empno for searching");
			int eno2 = scan.nextInt();
			for (int k = 0; k < stud.size(); k++) {
				if (stud.get(k).getEmpno() == eno2)
					System.out.println(stud.get(eno2).toString());
			}
		case 7:
			String dnm = scan.next();
			for (int t = 0; t < stud.size(); t++) {
				if (stud.get(t).getDept().equals(dnm)) {
					System.out.println(stud.get(t).toString());
				}
			}
		default:
			System.out.println("Exit");
		}

	}

}
