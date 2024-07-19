public class DoPayrollTypeF {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        ftEmployee.setName("Hadi Khodapanah");
        ftEmployee.setJobTitle("CEO");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        ptEmployee.setName("Ali Alizadeh");
        ptEmployee.setJobTitle("Driver");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(50));
        PartTimeWithOver ptoEmployee = new PartTimeWithOver();
        ptoEmployee.setName("Kourosh Khashayari");
        ptoEmployee.setJobTitle("Driver");
        ptoEmployee.setHourlyRate(7.53);
        ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(50));
    }
}
