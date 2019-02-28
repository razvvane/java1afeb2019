public class Foo{ //Foo Bar Baz
    
    void modificaSuma(double suma){
        suma = 1000;
    }
    
    void modificaCont(Cont cont){
        cont.titular = "Billll";
    }
    
    public static void main(String [] args){
        Foo f=new Foo();
        
        double suma = 500;
        f.modificaSuma(suma);
        System.out.println(suma); // transfer prin valoarea
        
        Cont c1=new Cont("John", 1000);
        f.modificaCont(c1);
        System.out.println(c1.titular);// transfer prin referinta
    }
}