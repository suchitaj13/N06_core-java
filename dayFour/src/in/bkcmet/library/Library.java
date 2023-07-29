//program to demonstrate on access specifier
package in.bkcmet.library;

public class Library {
	//different access specifiers
	public String libraryName;
	private int userId;
	String booksName;
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name: "+libraryName);
	}
private void displayPrivate()
{
	System.out.println("User Id"+userId);
}
void displayDefault()
{
	System.out.println("BookName"+booksName);
}
}

