import java.util.Scanner;
 
public class PickingGoodAceMilen {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int count=0;
        int tries=0;
        do{
            char x1=sc.next().charAt(0);
            char x2=sc.next().charAt(0);
            if((x1<'2' || x1>'9')&&(x1!='A' && x1!='T'&& x1!='J'&& x1!='Q' && x1!='K')){
                System.out.println("Ivalid input");
                continue;
            }
            if((x2<'2' || x2>'9')&&(x2!='A' && x2!='T'&& x2!='J'&& x2!='Q' && x2!='K')){
                System.out.println("Ivalid input");
                continue;
            }
            tries++;
            if(x1>='A' && x2 >='A'){
                count++;
                continue;
            }
            count=0;
        }while(count<5);
         
        System.out.println(tries);
        sc.close();
    }
 
}