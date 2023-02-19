package usingautowireannot;

public class Passport {
	private String city;
	private String enddate;
	
	

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Passport() {
		System.out.println("Inside default-Passport constructot");
	}
	public void documentation()
	{
		System.out.println("Address and Identity proof");
	}
	
	
}
