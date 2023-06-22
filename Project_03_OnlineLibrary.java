import java.util.Scanner;

// // ********* project-3--> (Online library)***************************************** 
// /*  you have to implement a library using java class Library
//  Implementation-: 
//  1. method: issueBook, returnBook, showAvailableBook, addBook
//  2. properties: Array to store the available book, array to store the issued book.
// */
// import java.util.Scanner;

// class Library{
//      String [] books;
//      int no_of_books;
//      Scanner sc = new Scanner(System.in);
//      Library(){
//          this.books = new String[100];
//          this.no_of_books =0;
//      }

//     //  addBook() method--> 
//      void addBook(String book){
//          this.books[no_of_books] = book;
//          no_of_books++;
//          System.out.println(book+ " has been added");
//      }

//     //  issueBook() method-->
//     void issueBook(){
//         System.out.println("Please Enter the Name of Book");
//         String bookName = sc.nextLine();
//        for(int i=0; i<this.books.length; i++){
//         if(bookName.equals(this.books[i])){
//             System.out.print("Issued book is "+ bookName);
//             this.books[i] =null;  // not necessary
//             return;
//         }    
//     }
//     System.out.println( "Sorry, This book is not available in Library Right Now");
//     }
     
//     //   returnBook()--> 
//     void returnBook(){
//         System.out.println("\nEnter the name of book you want to return");
//         String returnBookName = sc.nextLine();
//         addBook(returnBookName);
//         System.out.println("You have Returned "+ returnBookName+ " book..");
//     }


//    //  showAvailableBooks() method-> 
//     // using for-each loop >>>
//      void showAvailableBooks(){
//          System.out.println("Welcome..!!..\nBooks Available in Library are Listed Below");
//          for(String book: this.books){
//              if(book == null){
//                 //  break;     // break krne se book issue k baad jo null hua uski wajah se ye loop se bahar aa jaga or saari book nhi show krega isliye continue usekrenge ..
//                  continue;
//              }
//              System.out.println("* "+ book);
//          }
//      }
// }
// public class Project_03_OnlineLibrary {
//      public static void main(String[] args) {
//      Library centralLibrary = new Library();
//          centralLibrary.addBook("Wings of Fire");    
//          centralLibrary.addBook("Think and Grow Rich");    
//          centralLibrary.addBook("Data structures and Algorithms"); 
     
//           centralLibrary.issueBook();
//           centralLibrary.returnBook();
//           centralLibrary.showAvailableBooks();
     
//      }    
// }


// ***************************************************************************************** 
// ***************************************************************************************** 
// ***************************************************************************************** 
class Library{
    String [] books;
    int no_books;
    Scanner sc = new Scanner(System.in);
    Library(){
        this.books = new String[100];
        this.no_books =0;
    }
    void addBooks(String book){
        // System.out.println("Enter book you want to add");
        this.books[no_books] = book;
        no_books++;
        System.out.println(book +" had been added");
    }
    void issueBook(){
        System.out.println("Enter the name of book you want to issue: ");
        String book = sc.nextLine();
        for(int i=0; i<this.books.length; i++){
            if(book.equals(this.books[i])){
      System.out.println("Issued book is "+ book);
      this.books[i]=null;
      return;
            }
        }
        System.out.println("Sorry, This book is not available right now..!!");
    }

    void returnBook(){
        System.out.println("Enter the name of book you want to return");
        String book = sc.nextLine();
        addBooks(book);
        System.out.println(book + " has been successfully returned.");
    }

    void showAvailableBook(){
        System.out.println("Here, List of available books are shown here: ");
        for (String book : this.books){
            if(book ==null){
                continue;
            }
            System.out.println("*"+ book);
        }
    }
}
class Project_03_OnlineLibrary{
    public static void main(String[] args) {
        Library l = new Library();
        // l.showAvailableBook();
        
        l.addBooks("Wings of Fire");
        l.addBooks("Data Structures and Algorithms");
        l.addBooks("The power of subconscious mind");
        l.addBooks("Rich dad poor dad");
        l.addBooks("Aquetas");

        // l.showAvailableBook();

        l.issueBook();
        l.returnBook();
        l.showAvailableBook();
    }
}