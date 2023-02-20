package dependencyinjection;

public class Employee {
	
	private int id;
	private String empname;
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	*/
	/*When we achieve DI using constructor use constructor-arg tag inside
	 * "beans.xml" file
	 */
	public Employee(int id,String empname) {
		super();
		this.id = id;
		this.empname = empname;
	}
	public void display()
	{
		System.out.println("Emp ID is: "+id+" "+"Emp NAme is: "+empname);
	}

}
