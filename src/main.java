import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        int choice = 1;
        long num = 125;
        short anum =123;
        double asd = 123.4;
        float xd = 1254.3f;
        byte e;
        boolean d;
        char xcd = '\0';

        asd = choice;
        System.out.println(asd);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        if(choice >= 1 && choice <=5){
            System.out.println("This is a positive number");
        }else if(choice < 1 && choice >= -5)
        {
            System.out.println("This is a negative number!");
        }

        switch(choice){
            case 1: displayLoop();break;
        }


    }

    public static void displayLoop(){
        int i = 0;
        for (;i<5;i++){
            System.out.println(i);
        }

        while(i >= 0){
            System.out.println("-"+ i--);
        }

        do{
            System.out.println("+"+ i++);
        }while(i<5);

        int array[] = {1,2,3,4,5};
        for(int anothernumber:array)
        {
            System.out.println("Squared: " + anothernumber * anothernumber);
            System.out.println("Square roort: " + anothernumber / (anothernumber + 5));
            System.out.println("Addition: "+ (anothernumber + anothernumber));
            System.out.println("Subtraction: " + (anothernumber - (anothernumber + 3)));
            System.out.println("Modulo: " + anothernumber % 2);
        }
    }
}
