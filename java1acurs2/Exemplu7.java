public class Exemplu7{
    public static void main(String [] args){
        int i=10;
        int j=20;
        int n=30;
        
        A:
        while(i<n){
            b:
            while(j<n){
                System.out.println(i);
                if(j%2==0) break A;
            }
        }
    }
}
