public class SonOfBoo extends Boo {

    public SonOfBoo(){
        super("boo");
    }

    public SonOfBoo(int i){
        super("Fred");
    }

    public SonOfBoo(String s){
        super(42);
    }

    /*
    public SonOfBoo(String a, String b, String c){
        super(a,b);
    }*/



    @Override
    public String toString() {
        return "SonOfBoo{}";
    }
}
