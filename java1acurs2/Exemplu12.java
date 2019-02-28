public class Exemplu12{
    public static void main(String [] args){
        Pisica p1 = new Pisica("Tom");
        p1.greutate=10;
        p1.culoare="alb";
        
        Pisica p2=new Pisica("Leo"); //instanta in zona de memorie are tot timpul 2 bytes 
        p2.greutate=2;
        p2.culoare="negru";
        
        System.out.println(p1.nume);
        System.out.println(p2.nume);
        
        p1.spuneMiau();
        p2.spuneMiau();
        
        Cont c1=new Cont("A", 100);
        Cont c2=new Cont("B", 300);
        c1.depune(10);
        System.out.println(c1.sold);
        c1.retrage(50);
        System.out.println(c1.sold);
        System.out.println();
        
        c1.transfera(c2, 50);
        System.out.println(c1.sold);
        System.out.println(c2.sold);
        System.out.println();
        
        boolean b1=c1.retrage(50);
        boolean b2=c1.retrage(400);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(c1.sold);
        
        
        
        
    }
}