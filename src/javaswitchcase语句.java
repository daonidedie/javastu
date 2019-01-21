public class javaswitchcase语句 {
    public  void test(int n,String s)
    {

        switch (n){
            case 1:
                System.out.println("switch case 1");
                break;
            case 2:
                System.out.println("switch case 2");
                break;
            case 5:
                System.out.println("switch case 5");
                break;
            case 6:
            case 7:
                System.out.println("switch case 67");
                break;
            default:
                    System.out.println("switch default");

        }

        switch (s){
            case "1":
                System.out.println("s case '1'");
                break;
            case "2":
                System.out.println("switch case '2'");
                break;
            case "5":
                System.out.println("switch case '5'");
                break;
            case "6":
            case "7":
                System.out.println("switch case '67'");
                break;
            default:
                System.out.println("switch 'default'");

        }

    }


}
