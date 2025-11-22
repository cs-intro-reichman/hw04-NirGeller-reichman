public class Primes {
    public static void main(String[] args) {
        String input =args[0];
        int n = Integer.parseInt(input);
        boolean arr[] = new boolean[n+1];
        for (int i=2; i<=n; i++){
            arr[i]= true;
        
    }
    arr[0] = false;
    arr[1] = false;
        
    
    
    for (int i=2; i*i<=n; i++){
        if (arr[i] == true){
        for (int j=i*i; j<=n; j=j+i){
        arr[j] = false;
            }
        }}
         System.out.println("Prime numbers up to " + n + ":");
        for (int i=2; i<=n; i++){
            if (arr[i] == true){
             System.out.println(i);
            }
            
            }
                int count =0;
            for (int i=2; i<=n; i++){
                if (arr[i] == true){
                    count++;
                }
    }
    System.out.println("There are "+ count +" primes between 2 and "+ n+ " (" + (int)(((double)count/n)*100) + "% are primes)");
        
}
}
