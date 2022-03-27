package Demo3;

public class Outer {
    public void methodOuter(){
        class Inner{
            final int NUM = 10;
            public void methodInner(){
                System.out.println("NUM = " + this.NUM);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}
