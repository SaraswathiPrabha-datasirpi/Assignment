public class Data {

    private void greet(){
        System.out.println("Hello");
    }

    private void greet(String name){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        Data d = new Data();
        d.greet();
        d.greet("Sana");
    }
    
}
