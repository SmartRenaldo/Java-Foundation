package Quick;

class Foo {
    int i;
    public void display() {
        System.out.println(i);
    }
}

class Bar extends Foo {
    int j;
    public void display() {
        System.out.print(j);
    }
}

class Main {
    public static void main(String args[]) {
        Bar bar = new Bar();
        bar.i = 1;
        bar.j = 2;
        Foo foo = bar;
        foo.display();
    }
}