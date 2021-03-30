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
            case 2: System.out.println(summation(10));break;
            case 3: evenNumbers(input.nextInt());break;
            default: square(10);break;
        }

        System.out.println("Enter the day: ");
        int day = input.nextInt();

        if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else if(day == 7){
            System.out.println("Sunday");
        }

        switch(day){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
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
            anothernumber+=5;
            System.out.println("Square roort: " + anothernumber / (anothernumber + 5));
            anothernumber-=3;
            System.out.println("Addition: "+ (anothernumber + anothernumber));
            anothernumber*=6;
            System.out.println("Subtraction: " + (anothernumber - (anothernumber + 3)));
            anothernumber/=4;
            anothernumber%=2;
            System.out.println("Modulo: " + (float)anothernumber % 2);
        }
    }

    public static void square(int n){
        int i=0;
        while(i<n){
            System.out.print("[" + (++i) + "]");
        }
    }

    public static int summation(int n){
        int i =1,retval = 0;
        while(i<=n){
            System.out.print(i + " + ");
            retval+= (i++);
        }

        System.out.println(" = " + retval);

        return retval;
    }

    public static void evenNumbers(int n){
        int i=1;
        do{
            System.out.print(((i++) * 2) + " ");
        }while(i<=n);
    }
}
