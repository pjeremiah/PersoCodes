class Payslip {
    public static final double PROGRAMMER_RATE_PER_HOUR = 1500;
    public static final double ANALYST_RATE_PER_HOUR = 1000;
    public static final double ENCODER_RATE_PER_HOUR = 500;
    public static final double WITHHOLDING_TAX_RATE = 0.1;
    public static final double SSS_DEDUCTION = 25;
    public static final double PAGIBIG_DEDUCTION = 50;

    public static void generatePayslip(Employee employee, double hoursWorked) {
        String position = employee.getPosition();
        double ratePerHour = getRatePerHour(position);
        double grossPay = ratePerHour * hoursWorked;
        double totalDeduction = calculateTotalDeduction(grossPay);
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee ID: " + employee.getEmpID());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Position: " + position);
        System.out.println("Contact Number: " + employee.getContactNo());
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Total Deduction: " + totalDeduction);
        System.out.println("Net Pay: " + netPay);
    }

    public static double getRatePerHour(String position) {
        switch (position.toLowerCase()) {
            case "programmer":
                return PROGRAMMER_RATE_PER_HOUR;
            case "analyst":
                return ANALYST_RATE_PER_HOUR;
            case "encoder":
                return ENCODER_RATE_PER_HOUR;
            default:
                return 0;
        }
    }

    public static double calculateTotalDeduction(double grossPay) {
        double withholdingTax = grossPay * WITHHOLDING_TAX_RATE;
        return withholdingTax + SSS_DEDUCTION + PAGIBIG_DEDUCTION;
    }
}