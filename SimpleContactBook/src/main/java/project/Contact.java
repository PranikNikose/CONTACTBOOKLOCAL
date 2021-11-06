package project;

public class Contact {
	private String Name;
	private String Email;
	private String Mobile;
	private String Occupation;
	private String Place;

	public Contact() {
		super();
	}

	public Contact(String name, String email, String mobile, String occupation, String place) {
		super();
		Name = name;
		Email = email;
		Mobile = mobile;
		Occupation = occupation;
		Place = place;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", Email=" + Email + ", Mobile=" + Mobile + ", Occupation=" + Occupation
				+ ", Place=" + Place + "]";
	}

}
