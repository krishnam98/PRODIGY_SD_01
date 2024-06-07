import java.util.*;
public class task1{
    public static void input(float temp, int unit){
        System.out.println("input Temperature: "+temp);
        if(unit==1){
            System.out.println("original unit: Celsius");
        }

        if(unit==2){
            System.out.println("original unit: Fahrenheit");
        }

        if(unit==3){
            System.out.println("original unit: Kelvin");
        }
    }
    public static void  main(String args[]){
        float inp_temp;
        int inp_unit;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter temperture: ");
        inp_temp=sc.nextFloat();
        System.out.print("enter unit (1 for 'Celsius', 2 for 'Fahrenheit', 3 for 'Kelvin'): ");
        inp_unit=sc.nextInt();

        input(inp_temp, inp_unit);
        if(inp_unit==1){
            float fahr=((9*inp_temp)/5)+32;
            float kelvin= inp_temp + (float)273.15;

            System.out.println("Fahrenheit: "+fahr+"°f");
            System.out.println("Kelvin: "+kelvin+" k");
        }

        else if(inp_unit==2){
            float cels=((inp_temp-32)*5)/9;
            float kelvin=cels+(float)273.15;

            System.out.println("Celsius: "+cels+"°c");
            System.out.println("Kelvin: "+kelvin+" k");
        }
        else if(inp_unit==3){
            float cels=inp_temp-(float)273.15;
            float fahr=((9*cels)/5)+32;

            System.out.println("Celsius: "+cels+"°c");
            System.out.println("Fahrenheit: "+fahr+"°f");
            
        }

        else{
            System.out.println("enter valid Indicator!");
        }
        

    }
}