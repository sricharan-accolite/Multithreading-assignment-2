class Reservation implements Runnable {

     int totalSeats = 10;
     

   
     public void run() {
          synchronized (this) {
              
              System.out.println("Total number of seats = " + totalSeats);
              
              if (totalSeats >= 1) {

                   String name = Thread.currentThread().getName();
                   System.out.println(1 + " Seat reserved for " + name);
                   totalSeats--;
                } 
              else System.out.println("No berths available");
        }
     }

}

public class Main {

     public static void main(String[] args) {
       
          Reservation obj = new Reservation();
          Thread t1 = new Thread(obj);
          Thread t2 = new Thread(obj);
          Thread t3 = new Thread(obj);
          Thread t4 = new Thread(obj);
          Thread t5 = new Thread(obj);
          Thread t6 = new Thread(obj);
          Thread t7 = new Thread(obj);
          Thread t8 = new Thread(obj);
          Thread t9 = new Thread(obj);
          Thread t10 = new Thread(obj);
          Thread t11 = new Thread(obj);
          t1.setName("Person 1");
          t2.setName("Person 2");
          t2.setName("Person 3");
          t2.setName("Person 4");
          t2.setName("Person 5");
          t2.setName("Person 6");
          t2.setName("Person 7");
          t2.setName("Person 8");
          t2.setName("Person 9");
          t2.setName("Person 10");
          t2.setName("Person 11");
          
          
          
          
          t1.start();
          t2.start();
          t3.start();
          t4.start();
          t5.start();
          t6.start();
          t7.start();
          t8.start();
          t9.start();
          t10.start();
          t11.start();
     }
}


