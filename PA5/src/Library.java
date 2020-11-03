import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;


public class Library {
	public static final char AUTHOR_SEARCH = 'A';
	public static final char OVER_DUE_SEARCH = 'O';
	public static final char PATRON_SEARCH = 'P';
	public static final char TITLE_SEARCH = 'T';
	private Book[] books;
	private Patron[] patrons;
	
	public Library(Book[] books, Patron[] patrons) {
		this.books = books;
		this.patrons = patrons;
	}
	
	public boolean checkin(Book book) {
		if (book != null) {
            
            // make sure it's a library book
            for (Book item : books) {
                if (item.equals(book)) {
                    
                    // make sure it's checked out
                    if (item.getStatus() == Book.UNAVAILABLE) {
                        
                        // calculate/save the fine
                        double fine = determineFine(book);
                        book.getPatron().adjustBalance(fine);
                        book.checkin();
                        return true;
                    }
                }
            }
        }
        return false;
	}
	
	public boolean checkout(Book book, Patron patron) {
		if (book != null && patron != null) {
            
            // make sure it's a library book
            for (Book item : books) {
                if (item.equals(book)) {
                    
                    // make sure it's checked in
                    if (item.getStatus() == Book.AVAILABLE) {
                        
                        // calculate the due date
                        Date due = DateUtils.addDays(new Date(), 10);
                        book.checkout(patron, due);
                        return true;
                    }
                }
            }
        }
        return false;
	}
	
	public double determineFine(Book book) {
		Date date = new Date();
		double fine = DateUtils.interval(book.getDue(), date) * 0.5;
        return fine;
	}
	
	public Book[] searchBooks(Object key, char type) {
            
            int counter = 0;
            if (type == TITLE_SEARCH){
                for (int i = 0; i < books.length; i++) {
                    if (key.equals(books[i].getTitle())){
                        counter++; 
                        //insert (books[i] into arr
                    }
                }
                Book[] arr = new Book[counter];
                for (int i = 0; i < books.length; i++) {
                   if (key.equals(books[i].getTitle())){
                        arr[i] = books[i];
                    }
                }
                return arr;
            }
            if (type == OVER_DUE_SEARCH) {
                for (int i = 0; i < books.length; i++) {
                    if(books[i].getStatus() == 2 && books[i].getDue().before((Date)key)) {
                        counter++; 
                        //insert (books[i] into arr
                    }
                }
                Book[] arr = new Book[counter];
                for (int i = 0; i < books.length; i++) {
                   if(books[i].getStatus() == 2 && books[i].getDue().before((Date)key)){
                        arr[i] = books[i];
                    }
                }
                return arr;
            }
            if (type == PATRON_SEARCH) {                
                 for (int i = 0; i < books.length; i++) {
                    if (key.equals(books[i].getPatron())){
                        counter++; 
                        //insert (books[i] into arr
                    }
                }
                Book[] arr = new Book[counter];
                for (int i = 0; i < books.length; i++) {
                   if (key.equals(books[i].getPatron())){
                        arr[i] = books[i];
                    }
                }
                return arr;
            }
            if (type == AUTHOR_SEARCH) {
                for (int i = 0; i < books.length; i++) {
                    if (key.equals(books[i].getAuthor())){
                        counter++; 
                        //insert (books[i] into arr
                    }
                }
                Book[] arr = new Book[counter];
                for (int i = 0; i < books.length; i++) {
                   if (key.equals(books[i].getAuthor())){
                        arr[i] = books[i];
                    }
                }
                return arr;
            }
            
            
          return null;
	}
	
}
