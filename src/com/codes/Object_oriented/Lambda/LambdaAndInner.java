package com.codes.Object_oriented.Lambda;
@FunctionalInterface
interface Displayable{
    void display();
    default int add(int a, int b){
        return a + b;
    }
}
public class LambdaAndInner {
    private int age = 12;
    private static String name = "疯狂软件教育中心";
    public void test(){
        String book = "疯狂java讲义";
        Displayable dis = () -> {
            System.out.println("book的局部变量为：" + book);
            System.out.println("外部类的age实例变量为：" + age);
            System.out.println("外部类的name类变量为：" + name);
        };
        dis.display();
        System.out.println(dis.add(3, 5));
    }

    public static void main(String[] args) {
        LambdaAndInner lambdaAndInner = new LambdaAndInner();
        lambdaAndInner.test();
    }
}
