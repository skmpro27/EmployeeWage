
class CompanyStandard {
        public final int wagePerHr;
        public final int numWorkingDays;
        public final int numWorkingHrs;
        public  final String companyName;
        public  int totalEmpWage;

        public CompanyStandard(String companyName, int wagePerHr, int numWorkingDays, int numWorkingHrs) {

                this.companyName = companyName;
                this.wagePerHr = wagePerHr;
                this.numWorkingDays = numWorkingDays;
                this.numWorkingHrs = numWorkingHrs;
        }

        public void setTotalWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
        }

        @Override
        public String toString() {
                return "Employee wages of " + companyName + ": " + totalEmpWage;
        }
}

public class EmpWage {

        private static final int IS_FULL_TIME = 1;
        private static final int IS_PART_TIME = 2;

        private static int numOfCompany = 0;
        private static CompanyStandard company[] = new CompanyStandard[5];

        private static void empWageCompute(int i) {

                int empHrs = 0;
                int workingDay = 0;
                while (workingDay < company[i].numWorkingDays && empHrs < company[i].numWorkingHrs)
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
                        if (empHrs > company[i].numWorkingHrs)
                                empHrs = company[i].numWorkingHrs;
                }
                System.out.println("Working Days: " + workingDay + " and Working Hours: " + empHrs);
                int totalWage = empHrs * company[i].wagePerHr;
	        company[i].setTotalWage(totalWage);
        }

        public static void main(String args[]) {

                System.out.println("Welcome to Employee Wages Computation Program");

                company[numOfCompany] = new CompanyStandard( "DMart", 20, 20, 100);
		empWageCompute(numOfCompany);
                System.out.println(company[numOfCompany]);
		numOfCompany++;
                company[numOfCompany] = new CompanyStandard("Reliance", 30, 25, 120);
                empWageCompute(numOfCompany);
                System.out.println(company[numOfCompany]);
        }
}





