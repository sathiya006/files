import java.util.Scanner;
public class MarkExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int a=sc.nextInt();
        if(a>0 && a<40){
            System.out.println("fail");
        }else if(a>40 && a<60){
            System.out.println("pass");
        }else{
            System.out.println("good");
        }
    }
}
