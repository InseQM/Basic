package com.codes.Object_oriented.Lambda;

public class LambdaQs {
    public void eat(Eatable e){
        System.out.println(e);
        e.taste();
    }
    public void drive(Flyable f){
        System.out.println("我正在驾驶：" + f.toString() );
        f.fly("[碧空如洗的晴日]");
    }
    public void test(Addable add){
        System.out.println("5与3的和为：" + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        //省略{}
        lq.eat(() -> System.out.println("苹果的味道不错！"));
        //省略()
        lq.drive(weather -> {
            System.out.println("今天的天气是" + weather);
            System.out.println("直升机平稳起飞");
        });
        //省略return
        lq.test((int a, int b) -> a + b);
    }
}
