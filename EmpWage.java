
public class EmpWage {

	public static final int IS_EMPLOYEE_PRESENT = 1;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wages Computation Program");
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) (Math.random() * 2);
		if (empCheck == IS_EMPLOYEE_PRESENT)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee daily wage: " + empWage);
	}
}
