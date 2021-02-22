
public class EmpWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int WAGE_PER_HOUR = 20;

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Wages Computation Program");
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int) (Math.random() * 3);
		switch (empCheck)
		{
			case IS_FULL_TIME:
				empHrs = 8;
				break;

			case IS_PART_TIME:
				empHrs = 4;
				break;

			default:
				empHrs = 0;
		}
		empWage = empHrs * WAGE_PER_HOUR;
		System.out.println("Employee daily wage: " + empWage);
	}
}
