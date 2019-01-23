import javax.swing.plaf.synth.SynthTextAreaUI;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class java里的字符串 {

    public void RunAll()   {
//        一、获取当前类定义的所有方法，不包括父类和接口的
//        class.getDeclaredMethods()
//        1
//　　会返回当前类定义的所有方法（包括私有的、静态的、抽象的），但是不会返回接口和父类中定义的方法
//        二、获取当前类所有的public方法，包括父类和接口的
//        class.getMethods()

        HashMap<String, Method> methods = new  HashMap<String, Method>();
        for (Method m:this.getClass().getMethods()) {
            String mthodName=m.getName();
            if(mthodName!=Thread.currentThread().getStackTrace()[1].getMethodName()&&mthodName.startsWith("m")) {

                methods.put(m.getName(), m);
            }
        }

        for ( Method m:methods.values() ) {
            try {
                m.invoke(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }



    }

    public void  m1charAt返回指定索引处的char值()
    {
         System.out.println(  "sdfsf".charAt(3) +" "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    public void  m2compareTo把这个字符串和另一个字符串对象比较()
    {
        System.out.println("sdfsf".compareTo("fs")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void  m3compareTo按字典顺序比较两个字符串()
    {
        System.out.println("sdfsf".compareTo("")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void  m4compareToIgnoreCase按字典顺序比较两个字符串不考虑大小写()
    {


        System.out.println("sdfsf".compareToIgnoreCase("s")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }    public void  m5concat将指定字符串连接到此字符串的结尾()
    {


        System.out.println("sdfsf".concat("111")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void  m6contentEquals当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真()
    {
        System.out.println("sdfsf".contentEquals("sdfsf")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }
    public void  m7copyValueOf返回指定数组中表示该字符序列的()
    {

        System.out.println("sdfsf".copyValueOf(new char[]{'1','2'})+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void  m8copyValueOf返回指定数组中表示该字符序列的()
    {
        System.out.println("sdfsf".copyValueOf((new char[]{'1','2'}),1,1)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m9endsWith测试此字符串是否以指定的后缀结束()
    {

        System.out.println("sdfsf".endsWith("f")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m10equals将此字符串与指定的对象比较()
    {
        System.out.println("sdfsf".equals("f")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m11equalsIgnoreCase将此字符串另一个字符串比较不考虑大小写()
    {
        System.out.println("sdfsf".equalsIgnoreCase("22")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m12getBytes使用平台的默认字符集将此String编码为byte序列并将结果存储到一个新的byte数组中()
    {
        System.out.println("sdfsf".getBytes()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m13getBytes使用指定字符集将此String编码为bytes()
    {
        System.out.println("sdfsf".getBytes(StandardCharsets.UTF_8)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void  m14getChars将字符从此字符串复制到目标字符数组()
    {
        System.out.println("void (int srcBegin, int srcEnd, char[] dst, int dstBegin)"+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m15hashCode返回此字符串的哈希码()
    {
        System.out.println("sdfsf".hashCode()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m16indexOf返回指定字符在此字符串中第一次出现处的索引()
    {
        System.out.println("sdfsf".indexOf("d")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

        System.out.println(" 17 int indexOf(int ch, int fromIndex)"+
        "\n返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。"+
        "\n18 int indexOf(String str)"+
                "返回指定子字符串在此字符串中第一次出现处的索引。"+
        "\n19 int indexOf(String str, int fromIndex)"+
        "返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。");
    }
    public void  m20返回字符串对象的规范化表示形式()
    {
        System.out.println("sdfsf".intern()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m1lastIndexOf返回指定字符在此字符串中最后一次出现处的索引()
    {
        System.out.println("sdfsf".lastIndexOf("s")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m1lastIndexOf返回指定字符在此字符串中最后一次出现处的索引从指定的索引处开始进行反向搜索()
    {
        System.out.println("sdfsf".lastIndexOf("s",2)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
        String ss="    23 int lastIndexOf(String str)\n" +
                "返回指定子字符串在此字符串中最右边出现处的索引。\n" +
                "\n" +
                "        24 int lastIndexOf(String str, int fromIndex)\n" +
                "返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。\n";
        System.out.println(ss);
    }
    public void  m25返回此字符串的长度()
    {
        System.out.println("sdfsf".length()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void  m26matches告知此字符串是否匹配给定的正则表达式()
    {
        System.out.println("sdfsf".matches("/w+")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m27regionMatches测试两个字符串区域是否相等()
    {
        System.out.println("boolean (boolean ignoreCase, int toffset, String other, int ooffset, int len)"+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
        String ss="    28 boolean regionMatches(int toffset, String other, int ooffset, int len)"+
       " 测试两个字符串区域是否相等";
        System.out.println(ss);
    }
    public void  m29replace替换此字符串()
    {
        System.out.println("sdfsf".replace("s","11")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m29replaceAll替换此字符串所有匹配给定的正则表达式的子字符串()
    {
        System.out.println("sdfsf".replaceAll("s","11")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m30replaceFirst替换此字符串匹配给定的正则表达式的第一个子字符串()
    {
        System.out.println("sdfsf".replaceFirst("s","111")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m32split根据给定正则表达式的匹配拆分此字符串()
    {
        System.out.println("sdfsf".split("s")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
   String ss="  33 String[] split(String regex, int limit)\n" +
           "根据匹配给定的正则表达式来拆分此字符串。\n ";
        System.out.println(ss);
    }
    public void  m34startsWith测试此字符串是否以指定的前缀开始()
    {
        System.out.println("sdfsf".startsWith("1")+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
        String ss="    35 boolean startsWith(String prefix, int toffset)\n" +
                "测试此字符串从指定索引开始的子字符串是否以指定前缀开始。\n";
        System.out.println(ss);
    }

    public void  m36subSequence返回一个新的字符序列它是此序列的一个子序列()
    {
        System.out.println("sdfsf".subSequence(1,2)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m38substring返回一个新的字符串它是此字符串的一个子字符串()
    {
        System.out.println("sdfsdfsfsf".substring(0,4)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
        String ss="     38 String substring(int beginIndex, int endIndex)\n" +
                "返回一个新字符串，它是此字符串的一个子字符串。\n";
        System.out.println(ss);}
        public void  m39toCharArray将此字符串转换为一个新的字符数组()
    {

        System.out.println("sdfsf".toCharArray().length+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m40toLowerCase使用默认语言环境的规则将此String中的所有字符都转换为小写()
    {
        System.out.println("AAAA".toLowerCase()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
        String ss="41  String toLowerCase(Locale locale)\n" +
                "        使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。";
        System.out.println(ss);
    }
    public void  m42toUpperCase字符都转换为大写()
    {
        System.out.println("sdfsf".toUpperCase()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());

        String ss="44 String toUpperCase(Locale locale)\n" +
                "        使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。";
        System.out.println(ss);
    }
    public void  m45trim返回字符串的副本忽略前导空白和尾部空白()
    {
        System.out.println("sdfsf11   ".trim()+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    public void  m46valueOf返回给定datatype类型x参数的字符串表示形式()
    {
        System.out.println("sdfsf3".valueOf(3)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
   /*
    public void  m1()
    {
         System.out.println("sdfsf".charAt(3)+" "+Thread.currentThread().getStackTrace()[1].getMethodName());
    }

   下面是 String 类支持的方法，更多详细，参看 Java String API 文档:
    SN(序号)	方法描述
1	char charAt(int index)
    返回指定索引处的 char 值。

            2	int compareTo(Object o)
    把这个字符串和另一个对象比较。

            3	int compareTo(String anotherString)
    按字典顺序比较两个字符串。

            4	int compareToIgnoreCase(String str)
    按字典顺序比较两个字符串，不考虑大小写。

            5	String concat(String str)
    将指定字符串连接到此字符串的结尾。

            6	boolean contentEquals(StringBuffer sb)
    当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。

            7	static String copyValueOf(char[] data)
    返回指定数组中表示该字符序列的 String。

            8	static String copyValueOf(char[] data, int offset, int count)
    返回指定数组中表示该字符序列的 String。

            9	boolean endsWith(String suffix)
    测试此字符串是否以指定的后缀结束。

            10	boolean equals(Object anObject)
    将此字符串与指定的对象比较。

            11	boolean equalsIgnoreCase(String anotherString)
    将此 String 与另一个 String 比较，不考虑大小写。

            12	byte[] getBytes()
    使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。

            13	byte[] getBytes(String charsetName)
    使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。

            14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
    将字符从此字符串复制到目标字符数组。

            15	int hashCode()
    返回此字符串的哈希码。

            16	int indexOf(int ch)
    返回指定字符在此字符串中第一次出现处的索引。

            17	int indexOf(int ch, int fromIndex)
    返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。

            18	int indexOf(String str)
    返回指定子字符串在此字符串中第一次出现处的索引。

            19	int indexOf(String str, int fromIndex)
    返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。

            20	String intern()
    返回字符串对象的规范化表示形式。

            21	int lastIndexOf(int ch)
    返回指定字符在此字符串中最后一次出现处的索引。

            22	int lastIndexOf(int ch, int fromIndex)
    返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。

            23	int lastIndexOf(String str)
    返回指定子字符串在此字符串中最右边出现处的索引。

            24	int lastIndexOf(String str, int fromIndex)
    返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。

            25	int length()
    返回此字符串的长度。

            26	boolean matches(String regex)
    告知此字符串是否匹配给定的正则表达式。

            27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
    测试两个字符串区域是否相等。

            28	boolean regionMatches(int toffset, String other, int ooffset, int len)
    测试两个字符串区域是否相等。

            29	String replace(char oldChar, char newChar)
    返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。

            30	String replaceAll(String regex, String replacement)
    使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。

            31	String replaceFirst(String regex, String replacement)
    使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。

            32	String[] split(String regex)
    根据给定正则表达式的匹配拆分此字符串。

            33	String[] split(String regex, int limit)
    根据匹配给定的正则表达式来拆分此字符串。

            34	boolean startsWith(String prefix)
    测试此字符串是否以指定的前缀开始。

            35	boolean startsWith(String prefix, int toffset)
    测试此字符串从指定索引开始的子字符串是否以指定前缀开始。

            36	CharSequence subSequence(int beginIndex, int endIndex)
    返回一个新的字符序列，它是此序列的一个子序列。

            37	String substring(int beginIndex)
    返回一个新的字符串，它是此字符串的一个子字符串。

            38	String substring(int beginIndex, int endIndex)
    返回一个新字符串，它是此字符串的一个子字符串。

            39	char[] toCharArray()
    将此字符串转换为一个新的字符数组。

            40	String toLowerCase()
    使用默认语言环境的规则将此 String 中的所有字符都转换为小写。

            41	String toLowerCase(Locale locale)
    使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。

            42	String toString()
    返回此对象本身（它已经是一个字符串！）。

            43	String toUpperCase()
    使用默认语言环境的规则将此 String 中的所有字符都转换为大写。

            44	String toUpperCase(Locale locale)
    使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。

            45	String trim()
    返回字符串的副本，忽略前导空白和尾部空白。

            46	static String valueOf(primitive data type x)
    返回给定data type类型x参数的字符串表示形式。*/

}
