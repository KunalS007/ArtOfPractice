package test;

class Library
{
	String[]  book;
	int no_of_books;

	Library()
	{
		this.book = new String[100];
		this.no_of_books=0;
		
	}
	
	void add(String book1)
	{
		this.book[no_of_books]= book1;
		no_of_books++;
		System.out.println(book1 + " has been added ");
	}

	void showbooks()
	{
		System.out.println("Available Books Are:");
		for(String book : this.book)
		{
			System.out.println("*" + book);
		//	if(book == null)
			{
			break;
			}
		}
	}
	
	void bookIssue(String book)
	{
		for(int i=0; i<this.book.length;i++)
		
			if(this.book[i].equals(book))
			{
				System.out.println("The book is issued ");
				this.book[i]=null;
				return;
			}
		System.out.println("This book does not exist");
	}
}

public class Practice_Lirbary {

	public static void main(String[] args) {
		
		Library lb = new Library();
		lb.add("JAVA Book");
		
		lb.showbooks();
		
		lb.bookIssue("C++");
	}

}
