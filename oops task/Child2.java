public class Child2 extends Child1{
    public void task3(){
        System.out.println("Task 3 from child2 class");
    }
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.task3();
        c2.task2();
        c2.task1();
        System.out.println("  ");
        Child1 c1 =new Child1();
        c1.task2();
        c1.task1();

    }
    
}
