package mini_randomnumber;

 

import java.util.Random;

 

public class random_number{

 

    public static int randomNumber(int a, int b){

        Random random = new Random();
        int number = random.nextInt((b - a) + 1) + a;
        return number;

 

    }

 

}
