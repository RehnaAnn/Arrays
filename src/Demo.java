import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 This class will have a static attribute which is an ArrayList of Book objects
 Inside the main method:
 Prompt the user to enter books details.
 This data is used to create Book objects which are added to an ArrayList of books.
 */

public class Demo {

	static ArrayList<Book> books = new ArrayList<Book>();

	public static void main(String[] args) {
		String toContinue="y";
		String title;
		String author;
		long isbn;
		float price;
		boolean isBorrowed;

		Scanner sc=new Scanner(System.in);
		
		do {			
			//prompting the user to enter book details
			System.out.println("Please enter book title");
			title=sc.next();
			System.out.println("Please enter Author name");
			author=sc.next();
			System.out.println("Please enter isbn");
			
			//catching the exception for invalid isbn input
			try {				
			isbn=sc.nextLong();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Ending the menu option. Goodbye!");
				break;
			}
			System.out.println("Please enter price");
			
			//catching the exception for invalid price input
			try {
			price=sc.nextFloat();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Ending the menu option. Goodbye!");
				break;
			}
			System.out.println("Book borrowed (Y/N)");
			String yesno=sc.next();
			isBorrowed=true;
			
			if(yesno.equalsIgnoreCase("n")) {
				isBorrowed=false;
			}
			//create book
			Book book=new Book(title,author, isbn, price, isBorrowed);

			books.add(book);

			System.out.println("Do you want to continue (Y/N)");
			toContinue= sc.next();

		} while(toContinue.equalsIgnoreCase("y"));
		
		//create Book objects which are added to an ArrayList of book
		for( int i=0; i<=books.size()-1; i++) {
			System.out.println(books.get(i).toString());
		}

	}

}
