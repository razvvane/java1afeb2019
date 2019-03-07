public class Point{
    int x,y; //x,y nu se rezerva in memorie
    static int z; //z se rezerva in memorie, nu depinde de instanta
    
    static{ //se executa prima data cand este folosita clasa
        System.out.println("A");
    }
    
    { // se executa de fiecare data cand se creaza o noua instanta 
        //si numai atunci inainte constructorului
        System.out.println("B");
    }
    
    void display() {
        System.out.println(this.x + " " + this.y);
    }
    
    static void staticDisplay(Point p) { //nu este comportament al ob curent
       System.out.println(p.x + " " + p.y);
    }
}