public class Exemplu16{
    public static void main(String [] args){
        //m1();
        //m1(1);
        //m1(2,3,4,5,6,7,8);
        
        //m2(10,20);
        
        int [] x = {1,2,3,4,5};
        m1();
    }
    
    static void m1(int... x) { //var args, exista doar unul singur ca parametru si scris ultimul
        System.out.println(x.length); //0
        System.out.println(x[0]); //exceptie, index nu exista daca lungimea e 0
    }
    
    static void ms(int y, int... x) {
        System.out.println(x.length);
    }
    
    static void m3(int[]... x){
        System.out.println(x.length); //1
        System.out.println(x[0]); // !=null(o adresa)
    }
}