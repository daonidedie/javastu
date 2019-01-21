import java.util.*;

public class arraytt {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Tuzhi();

        susu();
        StringBufferTest();

        new java循环结构().Test();

        java条件语句  dd= new   java条件语句();
        dd.ifyuju(0);
        dd.ifyuju(1);
        dd.ifyuju(2);
        dd.ifyuju(3);
        dd.ifyuju(4);

       new 类的继承().GetSS();

new javaswitchcase语句().test(2,"4");
        new javaswitchcase语句().test(1,"2");


    }

    //http://www.runoob.com/java/java-stringbuffer.html
  //  題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
  //  对兔子，假如兔子都不死，问每个月的兔子总数为多少？

    public static void Tuzhi()
    {

        long arr[] = new long[48];
        arr[0]=1;
        arr[1]=1;
         for (  int i=2; i<48; i++) {

             arr[i] = arr[i - 1] + arr[i - 2];
             System.out.println("第" + i + "个月有兔子" + arr[i] + "对" + ", " + "总数是" + 2 * arr[i]);
         }
    }

    //题目：判断101-200之间有多少个素数，并输出所有素数。
    //素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子。
    public static void susu()
    {


        for (  int i=101; i<121; i++) {



            int s=0;

            for (  int k=1; k<i; k++) {

                if(i>k){
                  if(i%k==0){

s++;

                  }
            }}

            if(s<2){


                System.out.println("在101~999之間一共有素數："+i);
            }

        }
    }

    //stringBulid 试用
    public static void  StringBufferTest(){

        StringBuffer buf;
        buf = new StringBuffer();
buf.append("fsdfsdf");
buf.append(111);
    System.out.print(buf.toString());

    }

}
