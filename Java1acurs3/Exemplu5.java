public class Exemplu5 {
    public static void main(String [] args) {
        int [] x1; //zona de memorie locala, nu are valoare
        
        x1 = new int[5];
        x1[0] = 5;
        
        System.out.println(x1.length); //length e final
        System.out.println(x1[0]);
        System.out.println(x1[1]);
        //valorile implicite ale variabilelor de memorie declarate in clase, fie static sau non statice, sunt:
        //0, 0.0, /u0000 pt char, false si null(inexistenta unei referinte)
        
        
    }
}