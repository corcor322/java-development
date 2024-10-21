package com.pluralsight;
//TODO: Finish punchtimecard method
public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private float payRate;
    private float hoursWorked;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public float getRegularHours () {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else
            return 40;
    }
    public float getOvertimeHours () {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else
            return 0;
    }
    public double getTotalPay () {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }
    public void punchTimeCard() {
        boolean isClockedIn = false;
        // Start time
        // End time
        hoursWorked = hoursWorked + (endTime - startTime)// End time - Start time -> add to hours worked
    }
}
