package Demo2;

public class SuperMario {
    //常量做信息标志和分类：常量入参不受控制，太随性
    //枚举做信息标志和信息分类：优雅
/*
    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;
*/
    enum Orientation {
        UP, DOWN, LEFT, RIGHT
    }

    public static void orientation(Orientation orientation) {
        switch (orientation) {
            case UP -> System.out.println("Mario up");
            case DOWN -> System.out.println("Mario down");
            case LEFT -> System.out.println("Mario left");
            case RIGHT -> System.out.println("Mario right");
        }
    }
}