public class Main {
	
	public static void main(String[] args) {
// 		// Write your code here
//         Scanner sc = new Scanner(System.in);
//         int y = sc.nextInt(); 

//         int count = 0;
//         int n = 0;

//         while (count < y) {
//             int term = 3 * n + 2;
//             if (term % 4 != 0) {
//                 System.out.print(term + " ");
//                 count++;
//             }
//             n++;
//         }

int N=5;
// int start = 1;
int start;
for(int i =0;i<N;i++){
    if(i%2==0)
    {
        start =1;

    }
    else{
        start=0;
    }
    for(int j =0;j<=i;j++){
        System.out.print(start);
        start = 1-start;
    }
    System.out.println();
}

	}
}



