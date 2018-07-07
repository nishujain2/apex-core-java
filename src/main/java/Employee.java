package main.java;

import java.math.BigDecimal;

/*
 * Class:
 * <access modifier - public/protected/private/default> <non-access modifier - static/final/abstract/synchronized> class <className PascalCase>
 * 
 * Field:
 * <access modifier - public/protected/private/default> <non-access modifier - static/final/abstract/synchronized> <data type> <camelCase variable name>
 *
 * Method:
 * <access modifier - public/protected/private/default> <non-access modifier - static/final/abstract/synchronized> <return type - void, etc.> <camelCase method name>
 * 
 */
public class Employee {

	private Integer empNo;
	private String empName;
	private String address;
	private String state;
	private Integer zipCode;
	private Integer phone;
	enum Designation {
		MANAGER, 
		LEAD,
		ANALYST
	};
	private Designation designation;
	private Integer expInYears;
	private String emailAddress;
	private BigDecimal basic;
	private BigDecimal hra;
	private BigDecimal bonus;
	
	public Employee() {}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Integer getExpInYears() {
		return expInYears;
	}

	public void setExpInYears(Integer expInYears) {
		this.expInYears = expInYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public BigDecimal getBasic() {
		return basic;
	}

	public void setBasic(BigDecimal basic) {
		this.basic = basic;
	}

	public BigDecimal getHra() {
		return hra;
	}

	public void setHra(BigDecimal hra) {
		this.hra = hra;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}
	
	public BigDecimal totalSalary() {
		//total salary (basic + hra + (bonus/100)*basic)
		return basic.add(hra).add(bonus.divide(new BigDecimal(100)).multiply(basic));
	}
}
