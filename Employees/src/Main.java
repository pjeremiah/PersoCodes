public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(1, "Jeremiah Pagarigan", "Programmer", "09499755316");
        double hoursWorked = 5;
        Payslip.generatePayslip(programmer, hoursWorked);
    }
}
