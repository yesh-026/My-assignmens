package seleniumSample;

public class Library {

	

	public String accessBook() {
		 String addBook= ("jungle Book");
		System.out.println("Book added successfully");
		return addBook;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
	}

public static void main(String[] args) {
	Library bookOptions=new Library();
	String returnedValue = bookOptions.accessBook();
	System.out.println(returnedValue);
	bookOptions.issueBook();
	
}
}
	





