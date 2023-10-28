import java.util.Scanner; 
 
public class DaysToMonthsAndDays { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Prompt the user for the number of days 
        System.out.print("Enter the number of days: "); 
        int totalDays = scanner.nextInt(); 
 
        int months = totalDays / 30;  // Average number of days in a month 
        int remainingDays = totalDays % 30; 
 
        System.out.println("Months: " + months); 
        System.out.println("Days: " + remainingDays); 
 
        scanner.close(); 
    } 
} 
 
 
