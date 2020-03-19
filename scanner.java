import java.util.Scanner;

public class inputs {

    public static void main(String[] args){
        /*String ch="shashank";
        Scanner obj=new Scanner(System.in);
        String a;
        //a= obj.hasNext();
        System.out.print("enter a string");
        a= obj.next();
        System.out.print(a);*/

        String[] ch=new String[10];//string array declaration


        int n=3;
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the string value");

        for (int i = 0; obj.hasNext() ; i++) {

            ch[i] = obj.next();
            if(i>2){
                break;
            }

        }
        for (int i = 0; i<=3 ; i++) {

            System.out.println(ch[i]);
            System.out.println(ch[i].length());



        }








    }
}
