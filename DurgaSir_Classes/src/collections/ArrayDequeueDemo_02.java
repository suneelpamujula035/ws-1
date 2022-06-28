package collections;

import java.util.ArrayDeque;
import java.util.Deque;

class Book{
	int id;
	String name;
	String author;
	String publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
public class ArrayDequeueDemo_02 {

	public static void main(String[] args) {

		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
		Deque<Book> q = new ArrayDeque<>();
		q.add(b1);
		q.add(b2);
		q.add(b3);
		
		for(Book b : q)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}

}
