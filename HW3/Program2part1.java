public class Program2part1 {

    public static int calculateBill(){ 
        // Purpose: To calculate the price of phone and internet for 1 month 

        int price = 1; // price per MB and per min 
        int weekdayinternet = price * 500; 
        int weekdayphone = price * 100; 
        int weekendinternet = price * 1000; 
        int weekendphone = price * 200; 

        int week = 5 * (weekdayinternet + weekdayphone);
        int weekend = 2 * (weekendinternet + weekendphone); 

        int weekdaytotal = 4 * week; 
        int weekendtotal = 4 * weekend; 

        return weekdaytotal + weekendtotal; 

    }

    public static void main(String[] args) { 

        System.out.println("$" + calculateBill()); 

    }

}
