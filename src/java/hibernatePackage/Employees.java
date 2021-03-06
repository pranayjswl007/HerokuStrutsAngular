package hibernatePackage;
// Generated 19 Aug, 2014 12:05:02 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private int employeeId;
     private String name;
     private Integer age;
     private String phone;
     private BigDecimal basicsalary;
     private BigDecimal totalsalary;

    public Employees() {
    }

	
    public Employees(int employeeId) {
        this.employeeId = employeeId;
    }
    public Employees(int employeeId, String name, Integer age, String phone, BigDecimal basicsalary, BigDecimal totalsalary) {
       this.employeeId = employeeId;
       this.name = name;
       this.age = age;
       this.phone = phone;
       this.basicsalary = basicsalary;
       this.totalsalary = totalsalary;
    }
   
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public BigDecimal getBasicsalary() {
        return this.basicsalary;
    }
    
    public void setBasicsalary(BigDecimal basicsalary) {
        this.basicsalary = basicsalary;
    }
    public BigDecimal getTotalsalary() {
        return this.totalsalary;
    }
    
    public void setTotalsalary(BigDecimal totalsalary) {
        this.totalsalary = totalsalary;
    }




}


