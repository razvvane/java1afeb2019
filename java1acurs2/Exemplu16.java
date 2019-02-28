public class Exemplu16{
    public static void main(String [] args){
        new Cont("Bill",1000);
        new Cont("John",500);
        
        
        Magazin m=new Magazin();
        Persoana p=new Persoana("Bill");
        p.cumpara(m,"Dacia","alba");
        
        System.out.println(p.masina.marca);
        System.out.println(p.masina.culoare);
    }
}