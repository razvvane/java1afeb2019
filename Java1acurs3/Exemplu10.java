public class Exemplu10 {
    public static void main(String [] args){
        int [][] x = {{}, {1,2,3}, null, new int[]{1,2,3}};
        
        System.out.println(x[2]); //null
        System.out.println(x[0]); // !=null
    }
}