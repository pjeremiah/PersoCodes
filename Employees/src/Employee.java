class Employee {
    public int empID;
    public String empName;
    public String position;
    public String contactNo;

    public Employee(int empID, String empName, String position, String contactNo) {
        this.empID = empID;
        this.empName = empName;
        this.position = position;
        this.contactNo = contactNo;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getPosition() {
        return position;
    }

    public String getContactNo() {
        return contactNo;
    }
}

