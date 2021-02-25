
public class EmpWage {

        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public final int WAGE_PER_HOUR;
        public final int NUM_WORKING_DAYS;
        public final int NUM_WORKING_HOURS;
        public final String COMPANY;

        public EmpWage(String str, int perHr, int days, int hrs) {

		COMPANY = str;
                WAGE_PER_HOUR = perHr;
		NUM_WORKING_DAYS = days;
		NUM_WORKING_HOURS = hrs;
        }

        public void empWageCondition() {

                int empHrs = 0;
                int workingDay = 0;
                while (workingDay < NUM_WORKING_DAYS && empHrs < NUM_WORKING_HOURS)
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
                        if (empHrs > NUM_WORKING_HOURS)
                                empHrs = NUM_WORKING_HOURS;
                }
                System.out.println();
                System.out.println("Employee wages of " + COMPANY + ": " + (empHrs * WAGE_PER_HOUR));
                System.out.println("Number of Working Days: " + workingDay);
                System.out.println("Number of Working Hours: " + empHrs);
        }

        public static void main(String args[]) {

		System.out.println("Welcome to Employee Wages Computation Program");

                EmpWage dMart = new EmpWage( "DMart", 20, 20, 100);
                EmpWage reliance = new EmpWage("Reliance", 30, 25, 120);

		dMart.empWageCondition();
		reliance.empWageCondition();
        }
}
