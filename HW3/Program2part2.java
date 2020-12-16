public class Program2part2 {

    public static int weekdayLoop(){ 
        // Purpose: To calculate the cost of internet and phone for 5 weekdays

        int weekdaytotal = 0; 
        int i = 0; 
        // INV: weekdaytotal = i * 600
        while (i < 5){ 
            // INV: weekdaytotal = i * 600 
            weekdaytotal = weekdaytotal + 600; 
            // INV: weekdaytotal = i * 600 + 600
            i++; 
            // INV: weekdaytotal = i * 600
        }
        return weekdaytotal; 
    }

    public static int weekendLoop(){ 
        // Purpose: To calculate the cost of internet and phone for 2 days of weekend

        int weekendtotal = 0; 
        int i = 0; 
        // INV: weekendtotal = i * 1200
        while (i < 2){ 
            // INV: weekendtotal = i * 1200
            weekendtotal = weekendtotal + 1200; 
            // INV: weekendtotal = i * 1200 + 1200 
            i++; 
            // INV: weekendtotal = i * 1200 
        }
        return weekendtotal; 
    }

    public static int monthlyBill(){ 
        // Purpose: To calculate the cost of internet and phone for 1 month

        int i = 0; 
        int monthtotal = 0; 
        // INV: monthtotal = i * weekdayLoop() + weekendLoop()
        while (i < 4){ 
            // INV: monthtotal = i * weekdayLoop() + weekendLoop()
            monthtotal = monthtotal + weekdayLoop() + weekendLoop(); 
            // INV: monthtotal = i * weekdayLoop() + weekendLoop() + weekdayLoop() + weekendLoop()
            i++; 
            // INV: monthtotal = i * weekdayLoop() + weekendLoop()
        }
        return monthtotal; 
    }

    public static void main(String[] args) { 

        System.out.println("$" + monthlyBill()); 

    }

}
