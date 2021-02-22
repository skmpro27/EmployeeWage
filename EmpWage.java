
public class EmpWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wages Computation Program");
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) (Math.random() * 3);
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;

		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee daily wage: " + empWage);
	}
}
