import java.util.Scanner;
class Customer {
Customer () {}
public static void main(String[] arg) {
Scanner scan = new Scanner(System.in);
User user = new User();
double balance = 0;
double deposit = 0;
double withdraw = 0;
int i = 0;
int id = 0;
String[] stmts = new String[10];
do {
System.out.println("welcome to ABC Bank");
System.out.println("choose an option from the list below");
System.out.println("choose 1. for Open Account");
System.out.println("choose 2. for Deposit");
System.out.println("choose 3. for Withdraw");
System.out.println("choose 4. for Check Balance");
System.out.println("choose 5. for Statements");
System.out.println("choose 6. for more Options");
System.out.print("choose the the operation you want to perform:");
int option = scan.nextInt();
	if(option == 1){
System.out.println("Enter User ID");
int userId = scan.nextInt();
System.out.println("Enter Surname:");
String surname = scan.nextLine();
scan.nextLine();
System.out.println("Enter first name:");
String firstName = scan.nextLine();
System.out.println("Enter gander:");
String gander = scan.nextLine();
System.out.println("Enter email address:");
String emailAddress = scan.nextLine();
System.out.println("Enter date of birth:");
String dateOfBirth = scan.nextLine();
System.out.println("Enter account number:");
long accountNumber = scan.nextLong();
System.out.println("Enter password");
int password = scan.nextInt();
System.out.println("Transaction successful. Current account balance R0.0");
stmts[id++] = "+" + balance;
user.openAccount(userId, firstName, surname,  emailAddress, password, dateOfBirth, gander, accountNumber);
	}

	else if(option ==2){
  	System.out.print("Enter password :");
  	int pword = scan.nextInt();
		if(pword == user.password) {
  		System.out.print("Enter amount to deposit : R");
		deposit = scan.nextDouble();
		balance = deposit + balance;
		stmts[id++] = "deposit" + deposit;
		System.out.println("Transaction successful. Your account balance is: R" + balance);
		}
		else{
		System.out.println("password incorrect");
		}
	}
	else if(option == 3){
   	System.out.print("Enter password :");
   	long pword = scan.nextLong();
			if(pword == user.password){
   	System.out.print("Enter amount to withdraw: R");
   	withdraw = scan.nextDouble();

			}
			else {
			System.out.println("password Incorrect");
			}
		if(balance >= withdraw) {
		balance = balance - withdraw;
		stmts[id++] = "withdraw" + withdraw;
		System.out.println(" Please Collect Your Money ");
		}
		else{
		System.out.println("Insufficient Balance");
		}
	}
	else if(option == 4){
  	System.out.print("Enter Password: ");
  	long pword = scan.nextLong();
			if(pword == user.password){
  	System.out.println("Balance : R" + balance);
			}
			else{
			System.out.println("password Incorrect");
			}
		}
	else if(option == 5){
	for(i = 0; i<id; i++) {
  	System.out.println(stmts[i]);
	}
i=i+10;
	}
	else if(option == 6){
  	System.out.println("More options");
	}
	else{
	System.out.println("involid option");
	}
i++;
}while( i < 100 );
}
}
