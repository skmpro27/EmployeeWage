
public class EmpWage {

	public static final int IS_EMPLOYEE_PRESENT = 1;

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wages Computation Program");
		int empCheck = (int) (Math.random() * 2);
		if (empCheck == IS_EMPLOYEE_PRESENT)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
