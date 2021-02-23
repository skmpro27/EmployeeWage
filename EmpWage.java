
public class EmpWage {

        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public final int WAGE_PER_HOUR;

        public EmpWage(int perHr) {

                System.out.println("Welcome to Employee Wages Computation Program");
                WAGE_PER_HOUR = perHr;
        }

        public int EmpWageCondition() {

                int empHrs = 0;
                int workingDay = 0;
                while (workingDay < 20 && empHrs < 100)
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
                        if (empHrs > 100)
                                empHrs = 100;
                }
                System.out.println("Number of Working Days: " + workingDay);
                System.out.println("Number of Working Hours: " + empHrs);
                return empHrs * WAGE_PER_HOUR;
        }

        public static void main(String args[]) {

                EmpWage obj = new EmpWage(20);
                System.out.println("Employee wages: " + obj.EmpWageCondition());
        }
}
