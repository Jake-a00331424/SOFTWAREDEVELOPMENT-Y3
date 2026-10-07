import java.io.*;

public class Staff implements Serializable {
	private int staffID;
	private String name;
	private String address;
	private double salary;
	
	public Staff(int staffID, String name, String address, double salary){
		this.staffID = staffID;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
