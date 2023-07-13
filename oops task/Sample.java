public class Sample {
    public static void main(String[] args) {
        Store s = new Store("ACD","22, South Car Street");
        System.out.println("Name: " + s.getName());
        System.out.println("Address: " + s.getAddress());
        s.setName("ABC");
        s.setAddress("14, North Car Street");
        System.out.println("New name: " + s.getName());
        System.out.println("New address: " + s.getAddress());
    }
}
