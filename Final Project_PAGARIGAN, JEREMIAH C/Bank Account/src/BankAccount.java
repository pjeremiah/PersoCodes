import java.io.*;

class BankAccount {
    private static int accountNo = 1000;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthdate;
    private String gender;
    private String address;
    private String fatherName;
    private String motherName;
    private String contactNo;
    private double balance;

    public BankAccount(String firstName, String middleName, String lastName, String birthdate, String gender,
                       String address, String fatherName, String motherName, String contactNo) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.gender = gender;
        this.address = address;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.contactNo = contactNo;
        this.balance = 500.0;
        accountNo++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountInfo() {
        return "Account No: " + accountNo +
                "\nName: " + firstName + " " + middleName + " " + lastName +
                "\nBirthdate: " + birthdate +
                "\nGender: " + gender +
                "\nAddress: " + address +
                "\nFather's Name: " + fatherName +
                "\nMother's Name: " + motherName +
                "\nContact No: " + contactNo +
                "\nBalance: " + balance;
    }

    public void saveAccountInfo() {
        String filename = "NewAccount.txt";
        try {
            FileWriter writer = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(getAccountInfo());
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



