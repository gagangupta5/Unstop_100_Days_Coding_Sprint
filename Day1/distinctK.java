import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextLine();
        int k=sc.nextInt();
        HashMap<String,Integer> freq=new HashMap<>();
        for(String s:arr) freq.put(s,freq.getOrDefault(s,0)+1);
        int count=0;
        for(String s:arr){
            if(freq.get(s)==1){
                count++;
                if(count==k){
                    System.out.println(s);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}