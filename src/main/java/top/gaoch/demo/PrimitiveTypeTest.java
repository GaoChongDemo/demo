package top.gaoch.demo;

public class PrimitiveTypeTest {
  public static void main(String[] args) {

    // boolean
    System.out.println("基本类型：boolean 二进制位数：《Java虚拟机规范》给出了4个字节，和boolean数组1个字节的定义，具体还要看虚拟机实现是否按照规范来，所以1个字节、4个字节都是有可能的。这其实是运算效率和存储空间之间的博弈，两者都非常的重要。");
    System.out.println("包装类：java.lang.Boolean");
    System.out.println("真值：Boolean.TRUE=" + Boolean.TRUE);
    System.out.println("假值：Boolean.FALSE=" + Boolean.FALSE);
    System.out.println();

    // byte
    System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
    System.out.println("包装类：java.lang.Byte");
    System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
    System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
    System.out.println();

    // short
    System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
    System.out.println("包装类：java.lang.Short");
    System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
    System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
    System.out.println();

    // int
    System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
    System.out.println("包装类：java.lang.Integer");
    System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
    System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
    System.out.println();

    // long
    System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
    System.out.println("包装类：java.lang.Long");
    System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
    System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
    System.out.println();

    // float
    System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
    System.out.println("包装类：java.lang.Float");
    System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
    System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
    System.out.println();

    // double
    System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
    System.out.println("包装类：java.lang.Double");
    System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
    System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
    System.out.println();

    // char
    System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
    System.out.println("包装类：java.lang.Character");
    // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
    System.out.println("最小值：Character.MIN_VALUE="
      + (int) Character.MIN_VALUE);
    // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
    System.out.println("最大值：Character.MAX_VALUE="
      + (int) Character.MAX_VALUE);
  }
}