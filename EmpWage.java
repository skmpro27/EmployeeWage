
import java.util.*;

interface IEmpWageCompute {
	static void addCompany(String companyName, int wagePerHr, int numWorkingDays, int numWorkingHrs) {
	}
        static void empWageCompute(int i) {
	}
}

class CompanyStandard {
        public final int wagePerHr;
        public final int numWorkingDays;
        public final int numWorkingHrs;
        public  final String companyName;
        public  int totalEmpWage;

        public ArrayList<Integer> dailyWage = new ArrayList<>();

        public CompanyStandard(String companyName, int wagePerHr, int numWorkingDays, int numWorkingHrs) {

                this.companyName = companyName;
                this.wagePerHr = wagePerHr;
                this.numWorkingDays = numWorkingDays;
                this.numWorkingHrs = numWorkingHrs;
        }

	public void setDailyWage(int wageDaily) {
		dailyWage.add(wageDaily);
	}

	public int getDailyWage(int idx) {
		return dailyWage.get(idx);
	}

        public void setTotalWage(int totalEmpWage) {
                this.totalEmpWage = totalEmpWage;
        }

        @Override
        public String toString() {
                return "Employee wages of " + companyName + ": " + totalEmpWage;
        }
}

public class EmpWage implements IEmpWageCompute {

        private static final int IS_FULL_TIME = 1;
        private static final int IS_PART_TIME = 2;

	private static int workingDay;
	private static Map<String,CompanyStandard> company = new HashMap<>();

	public static void addCompany(String companyName, int wagePerHr, int numWorkingDays, int numWorkingHrs) {
                company.put(companyName, new CompanyStandard( companyName, wagePerHr, numWorkingDays, numWorkingHrs));
		empWageCompute(companyName);
		for (int i = 0; i < workingDay; i++)
			System.out.println("Wage of day " + (i+1) + " : " + company.get(companyName).getDailyWage(i));
                System.out.println(company.get(companyName));
		System.out.println();
	}

        public static void empWageCompute(String str) {

                workingDay = 0;
		int totalEmpHrs = 0;
                while (workingDay < company.get(str).numWorkingDays && totalEmpHrs < company.get(str).numWorkingHrs)
                {
			int empHrs = 0;
                        workingDay++;
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
                        }
			totalEmpHrs += empHrs;
			if (totalEmpHrs > company.get(str).numWorkingHrs) {
                                totalEmpHrs = company.get(str).numWorkingHrs;
				empHrs = empHrs - (totalEmpHrs - company.get(str).numWorkingHrs);
			}
			company.get(str).setDailyWage(empHrs * company.get(str).wagePerHr);
                }
                System.out.println("Working Days: " + workingDay + " and Working Hours: " + totalEmpHrs);
                int totalWage = totalEmpHrs * company.get(str).wagePerHr;
	        company.get(str).setTotalWage(totalWage);
        }

        public static void main(String args[]) {

                System.out.println("Welcome to Employee Wages Computation Program");

                addCompany( "DMart", 20, 20, 100);
                addCompany("Reliance", 30, 25, 120);
        }
}
