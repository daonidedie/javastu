//http://www.runoob.com/java/java-inheritance.html
//2018-01-17 java学习
public class 类的继承 implements abc {

    @Override
    public String GetSS() {
        new 父类().AMethod();
       子类 a= new 子类();
       a.AMethod();
        System.out.print("\n重写了Method方法"+ a.AMethod(1111));
        return "继承了一个类";
    }
}

interface abc {

    String GetSS();

}


//类的继承格式
class 父类 {
    public String AMethod() {
        System.out.print("父类的一个方法");
        //获得当前类名
        String className = this.getClass().getName();
        //获得当前方法

        String curMehtodName = Thread.currentThread().getStackTrace()[1].getMethodName();//具体使用数组的那个元素和JVM的实现有关，我在SUN JDK6下面测试的是第二个元素，具体说明可以查看Thread.getStackTrace方法的javadoc

        String result = "\n执行" + className + ":" + curMehtodName;

        System.out.println(result);

        return result;
    }


}
//类的方法重写
class 子类 extends 父类 {
    /**
     * Amdthod 重写并使用super关键字调用父类
     * @return
     */
    public String AMethod() {
        System.out.print("\n我是子类");
    return     super.AMethod();

    }

    /**
     * AMethod方法的重载
     * @param abc
     * @return 返回传入的参数值
     */
    public  String AMethod(Integer abc){
         return   abc.toString();

    }

}