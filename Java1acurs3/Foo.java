public class Foo {
    
    static final int q = 10; //final rezerva in memorie un q pt fiecare instanta; static rezerva o singura data un singur q
    final int w;                           
    
    Foo(int w) {
        this.w=w;
    }
    
    void m1(final int P) {
        final int X=10;
        final int CONST=10;
        
    }
}