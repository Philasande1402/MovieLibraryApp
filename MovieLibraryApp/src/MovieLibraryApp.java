import java.sql.*; 
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovieLibraryApp { 
    
public static void main(String[] args) 
{ 
    
String dbURL = "jdbc:derby://localhost:1527/MovieLibrary"; //Modify according to your system

Connection conn = null; 
Statement stmt = null; 
ResultSet rs = null;

    // Initialize Scanner for user input
    Scanner scanner = new Scanner(System.in);

    try {

        // Connect to the database (1)
        conn = DriverManager.getConnection(dbURL);
        // Create a Statement object (1)
        stmt = conn.createStatement();
        // Execute the SELECT * FROM MOVIES query (1)
        rs = stmt.executeQuery("SELECT * FROM Movies");
        
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Check Stock by Director");
            System.out.println("2. Calculate Average Rating");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Call the checkStockByDirector function
                    checkStockByDirector(rs, scanner);
                    break;
                case 2:
                    // Call the calculateAverageRating function
                    calculateAverageRating(rs);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
            
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        // Close resources (1) 
        try {
            if(conn !=null) conn.close();
            if(stmt !=null) stmt.close();
            if(rs !=null) rs.close();
            
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
    scanner.close();
}

// Implement the checkStockByDirector function here (8)
public static void checkStockByDirector(ResultSet rs, Scanner scanner) {
    
     try {
       System.out.println("Enter a durectors name : ");
       String nameDirect = scanner.nextLine();
       int numberOfStock=0;
    
   
        while (rs.next()) {
            String director = rs.getString("director");
            if(nameDirect.equalsIgnoreCase(director))
            {
                numberOfStock += rs.getInt("stock");
            }
        }
        System.out.println("The number of movies by director "+nameDirect+" is "+numberOfStock);
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
  
}

// Implement the calculateAverageRating function here (5)
public static void calculateAverageRating(ResultSet rs) {
        try {
          double avarRating=0.0;
          int count=0;
        
          while(rs.next())
          {
            double rating = rs.getDouble("rating");
            avarRating +=rating;
            count++;
          }
          
          if(count >0)
          {
           avarRating = avarRating/count;
        
           System.out.println("The avarage rating is : "+avarRating);
          }else
          {
           System.out.println("No movies found.");
          }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
   
}

} 

