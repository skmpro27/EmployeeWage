
public class EmpWage {

        private static final int IS_FULL_TIME = 1;
        private static final int IS_PART_TIME = 2;

	private final int wagePerHr;
        private final int numWorkingDays;
        private final int numWorkingHrs;
        private final String companyName;
	private int totalEmpWage;

        public EmpWage(String companyName, int wagePerHr, int numWorkingDays, int numWorkingHrs) {

		this.companyName = companyName;
                this.wagePerHr = wagePerHr;
		this.numWorkingDays = numWorkingDays;
		this.numWorkingHrs = numWorkingHrs;
        }

        private void empWageCompute() {

                int empHrs = 0;
                int workingDay = 0;
                while (workingDay < numWorkingDays && empHrs < numWorkingHrs)
                {
                        workingDay++;
                        int empCheck = (int) (Math.random() * 3);
                        switch (empCheck)
                        {
                                case IS_FULL_TIME:
                                        empHrs += 8;
                                        break;

                                case IS_PART_TIME:
                                        empHrs += 4;
                                        break;

                                default:
                        }
                        if (empHrs > numWorkingHrs)
                                empHrs = numWorkingHrs;
                }
                System.out.println("Working Days: " + workingDay + " and Working Hours: " + empHrs);
		totalEmpWage = empHrs * wagePerHr;
        }

	@Override
	public String toString() {
		return "Employee wages of " + companyName + ": " + totalEmpWage;
	}

        public static void main(String args[]) {

		System.out.println("Welcome to Employee Wages Computation Program");

                EmpWage dMart = new EmpWage( "DMart", 20, 20, 100);
                EmpWage reliance = new EmpWage("Reliance", 30, 25, 120);

		dMart.empWageCompute();
		reliance.empWageCompute();

		System.out.println(dMart);
		System.out.println(reliance);
        }
}
