
public class ExploringStringsMethodMilen {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 = ("Izrechenie ot pet dumi edno");
        String str2 = ("Izrechenie ot pet dumi dve");
        String str3 = ("Izrechenie ot pet dumi tri");
        commonWords(str1, str2,str3);
 
    }
    static void commonWords(String str1, String str2, String str3){
        String[] arr1 = str1.split(" ");
        String[] common1 = new String[arr1.length];
        int idx=0;
        for (int i = 0; i < arr1.length; i++) {
            if(str2.indexOf(arr1[i])!=-1){
                common1[idx]=arr1[i];
                idx++;
            }
        }
        if(idx==0){
            System.out.println("There are not common words in the 3 strings");
            return;
        }
        String[] common2 = new String[idx];
        idx=0;
        int max=0;
        int longest=0;
        System.out.print("Words in 3 strings: ");
        for (int i = 0; i < common2.length; i++) {
            if(str3.indexOf(common1[i])!=-1){
                common2[idx]=common1[i];
                System.out.print(common2[idx]+", ");
                idx++;
            }
            if(max<common2[idx-1].length()){
                max=common2[idx-1].length();
                longest=idx-1;
            }
        }
        System.out.println();
        System.out.println("count of words = "+idx);
        System.out.println("Longest is: "+common2[longest]);
    }
 
}
