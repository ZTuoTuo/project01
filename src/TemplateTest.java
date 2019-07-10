import java.util.ArrayList;

/**
 * @data 2019-07-04 - 09:59
 *
 *
 * IDEA中代码模版所处的位置：settings - Editor - live Templates / Postfix Completion
 *
 */
public class TemplateTest {

    //模版六：prsf
    private static final Customer CUST = new Customer();
    //变形：psf
    public static final int NUM = 1;
    //变形：psfi,psfs
    public static final int NUM2 = 2;
    public static final String NATION = "china";


    //模版一：psvm
    public static void main(String[] args) {

        //模版二：sout
        System.out.println("hello!");
        //变形：soutp / soutm /soutv /xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //模版三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模版四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }
        //变形：list.fori 正序遍历
        for (int i = 0; i < list.size(); i++) {

        }
        //变形:list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
}
public void method(){
    System.out.println("TemplateTest.method");

    //模版五：ifn
    ArrayList list = new ArrayList();
    list.add(123);
    list.add(345);
    list.add(567);
    if (list == null) {

    }
    //变形：inn
    if (list != null) {

    }
    //变形:xxx.nn / xxx.null
    if (list != null) {

    }
    if (list == null) {

    }
}


