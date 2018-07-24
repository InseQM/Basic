package com.codes.Object_oriented.Enum;

public enum Gender implements GenderDesc{
//    MALE, FEMALE;
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        switch (this){
//            case MALE:
//                if (name.equals("男")){
//                    this.name = name;
//                }else{
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//            case FEMALE:
//                if (name.equals("女")){
//                    this.name = name;
//                }else{
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//        }
//    }
    MALE("男"), FEMALE("女");
    private final String name;
    Gender(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public void info() {
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
