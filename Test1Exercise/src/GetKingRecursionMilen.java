
import java.util.Random;
import java.util.Scanner;
 
public class GetKingRecursionMilen {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Random r= new Random();
        char[][] chess = new char[8][8];
        // enter other figures
        System.out.println("Please enter the number of figures");
        int m= sc.nextInt();
        int count=0;
        do{
            int i= r.nextInt(8);
            int j= r.nextInt(8);
            if(chess[i][j]!= 'X'){
                chess[i][j]= 'X';
                count++;
            }
        }while(count<m);
        // enter king
        int i=0;
        int j=0;
        do{
            i= r.nextInt(8);
            j= r.nextInt(8);
            if(chess[i][j]!= 'X'){
                chess[i][j]= 'K';
                break;
            }
        }while(true);
         
        //enter horse
        int k=0;
        int l=0;
        do{
            k= r.nextInt(8);
            l= r.nextInt(8);
            if(chess[k][l]!= 'X' && chess[k][l]!= 'K'){
                chess[k][l]= 'H';
                break;
            }
        }while(true);
         
        fieldPrint(chess);
        System.out.println(canTake(chess,i,j,k,l) ? "Yes it can" : "No it can't");
        sc.close();
                 
 
    }
    static boolean canTake(char[][] chess,int i,int j, int k,int l){
        if(i==k && j==l){
            return true;
        }
        if(k-2>=0 && l-1>=0 && chess[k-2][l-1]!='X'){
            chess[k-2][l-1]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k-2, l-1);
        }
        if(k-2>=0 && l+1<8 && chess[k-2][l+1]!='X'){
            chess[k-2][l+1]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k-2, l+1);
        }
        if(k-1>=0 && l+2<8 && chess[k-1][l+2]!='X'){
            chess[k-1][l+2]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k-1, l+2);
        }
        if(k+1<8 && l+2<8 && chess[k+1][l+2]!='X'){
            chess[k+1][l+2]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k+1, l+2);
        }
        if(k+2<8 && l+1<8 && chess[k+2][l+1]!='X'){
            chess[k+2][l+1]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k+2, l+1);
        }
        if(k+2<8 && l-1>=0 && chess[k+2][l-1]!='X'){
            chess[k+2][l-1]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k+2, l-1);
        }
        if(k+1<8 && l-2>=0 && chess[k+1][l-2]!='X'){
            chess[k+1][l-2]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k+1, l-2);
        }
        if(k-1>=0 && l-2>=0 && chess[k-1][l-2]!='X'){
            chess[k-1][l-2]='X';
            fieldPrint(chess);
            return canTake(chess, i, j, k-1, l-2);
        }
         
        return false;
                 
    }
     
     
    static void fieldPrint(char[][] field){
        for (int i = 0; i < field.length; i++) {
            horizontalPrint(field.length);
            for (int j = 0; j < field.length; j++) {
                if(j ==field.length-1){
                    System.out.print("|"+field[i][j]+"|");
                    System.out.println();
                }
                else{
                    System.out.print("|"+field[i][j]);
                }
            }
        }
        horizontalPrint(field.length);
    }
    static void horizontalPrint(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("__");
        }
        System.out.println();
    }
  
 
}
