import  java.util.*;
public class nice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr_num = 1;

        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==0||i==n-1){
                    System.out.print(curr_num);
                    curr_num+=1;
                }
                else{
                    if(j==0||j==n-1){
                      System.out.print(curr_num);
                    curr_num+=1;
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
            }
            curr_num=1;
             System.out.println();
                 
 
        }
         // Close the scanner
         sc.close();
 
    }

}
