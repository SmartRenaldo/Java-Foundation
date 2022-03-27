package Demo2;

public interface InterfaceDefault {
    /*
      从java 8开始，接口里允许定义默认方法
      格式：
      public default 返回值类型 方法名称（参数列表）{
          方法体
      }
      备注：接口当中默认方法，可以解决接口升级问题。
   */
    public abstract void methodAbs();
    public default void methodDef(){       //public可以省略不写
        System.out.println("Default method");
    }
}
