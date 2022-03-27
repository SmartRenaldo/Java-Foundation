package Demo2;

public class Outer {
    private int num = 10;
    public class Inner {
        private int num = 20;
        public void method(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
