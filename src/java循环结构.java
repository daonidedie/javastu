import  java.math.*;

//Java 循环结构 - for, while 及 do...while
public class java循环结构 {


    public  void Test()
    {

        System.out.print("while是最基本的循环\n");
        while循环();
        System.out.print("do…while 循环\n");
        doWhile循环();
        System.out.print("for");
        for循环();
        System.out.print("增强for循环\n");
        增强for循环();
    }

    /*
    * while是最基本的循环，它的结构为：
while( 布尔表达式 ) {
  //循环内容
}
只要布尔表达式为 true，循环就会一直执行下去。
    * */
    public void while循环()
    {
        int a=0;

        while (a<9){

            System.out.print(a++);

        }

    }
/*
* do…while 循环
对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。
* */
    public void doWhile循环()
    {
        int a=0;
            do{
                System.out.print(a++);
            }while(a<0);

    }

    /*
    * for循环
虽然所有循环结构都可以用 while 或者 do...while表示，但 Java 提供了另一种语句 —— for 循环，使一些循环结构变得更加简单。
for循环执行的次数是在执行前就确定的。语法格式如下：
for(初始化; 布尔表达式; 更新) {
    //代码语句
}
关于 for 循环有以下几点说明：
最先执行初始化步骤。可以声明一种类型，但可初始化一个或多个循环控制变量，也可以是空语句。
然后，检测布尔表达式的值。如果为 true，循环体被执行。如果为false，循环终止，开始执行循环体后面的语句。
执行一次循环后，更新循环控制变量。
再次检测布尔表达式。循环执行上面的过程。
    * */

    public void for循环()
    {

        for (  int k=0;k<9;k++ ){
            System.out.print(k);

        }
    }


    public void 增强for循环()
    {
        String[] abcds = new String[]{"a","b","c","d"};
        for(String x : abcds)
        {
            System.out.print(x);

        }

    }





}
