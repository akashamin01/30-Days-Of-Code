public class SalaryCompute {

    public static double SalaryCalculate(int monthlyHours,int perHourPay){
        double totalSalary = 0;
        int overTime = 32;
        monthlyHours = overTime + monthlyHours;
        totalSalary = monthlyHours * perHourPay;
        return totalSalary;
    }
    public static void main(String[] args){
        double finalSalary = SalaryCalculate(160,80);
        System.out.println("$"+finalSalary);
    }
}
