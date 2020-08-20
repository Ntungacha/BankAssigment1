class User{
	int userId;
	String firstName;
	String surname;
	int password;
	long accountNumber;
	String emailAddress;
	String gander;
	String dateOfBirth;

	// registration method starts here
	void openAccount(int userId, String firstName, String surname, String emailAddress, int password, String dateOfBirth, String gander, 
			 long accountNumber) {
		this.userId = userId;
		this.firstName = firstName;
		this.surname = surname;
		this.password = password;
		this.accountNumber = accountNumber;
		this.emailAddress = emailAddress;
		this.gander = gander;
		this.dateOfBirth = dateOfBirth;
	} // registration method ends here

	// display method starts here........ the use of the display method is to see
	// the content of the object
	void display() {
		System.out.println();
		System.out.println("User id=" + userId);
		System.out.println("First Name=" + firstName);
		System.out.println("Surname=" + surname);
		System.out.println("Gander=" + gander);
		System.out.println("PAssword=" + password);
		System.out.println("Account Number=" + accountNumber);
		System.out.println("Email Address=" + emailAddress);
		System.out.println("Date Of Birth=" + dateOfBirth);
	} // display method ends her
}
