import java.security.*;
import java.util.Scanner;

class jiaozi implements Runnable {

    static int[] jiaozi = { 0, 5000, 3000, 1000 };
    private String[] type = { null, "Pork", "Beef", "Vege" };

    private String sale;
    int[] sold = { 0, 0, 0, 0 };
    Thread t;
    SecureRandom random = new SecureRandom();

    jiaozi(String sale) {
        this.sale = sale;
        t = new Thread(this, sale);
        t.start();
    }

    public void run() {

        int count = 0;
        while (available()) {

            int choice = 1 + random.nextInt(3);
            int buyAmount = 10 + random.nextInt(40);

            //System.out.println(choice);

            if (buyAmount <= jiaozi[choice]) {
                count=0;
                buy(buyAmount,choice);
                sold[choice] += buyAmount;
                System.out.println(buyAmount + " of "+ type[choice]+ " dumplings sold at " + sale);
            }
            else
                count++;

            if(count>30){
               
                break;
            }


            //waiting time
            try{
                 t.sleep(3000);
            }
            catch(Exception e){
                System.out.printf("Error in Delay");
            }
        }
       
        System.out.println(sale+ " closed !");
        

    }

    public boolean available() {
        int sum = 0;
        for (int i = 0; i < jiaozi.length; i++) {
            sum += jiaozi[i];
        }
        if (sum > 0) {
            return true;
        } else {
            return false;
        }
    }

    synchronized private static void buy(int buyAmount,int type) {

        jiaozi[type] -= buyAmount;
        return;

    }
}
    public class A1073326_0512 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter how many customers can visit at the same time: ");
            int n = scan.nextInt();
            scan.nextLine();
            
            jiaozi[] j1 = new jiaozi[n];
            
            for(int i =1; i<=j1.length;i++){
                String lineNum= Integer.toString(i);
                j1[i] = new jiaozi("Line "+lineNum);
            }
        }
    }
