/**
 * @author Pengxinjie
 * @DATE 2021/3/19 - 10:36
 */
public class P04MethodTest {
    public static void main(String[] args) {
        //可变参数
        //一个方法中只能指定一个可变参数，且必须是方法的最后一个参数，任何普通的参数都得在它之前声明
        P04MethodTest p04MethodTest = new P04MethodTest();
        int i = p04MethodTest.test(1,2,3);
        System.out.println("和是："+i);
    }

    public int test(int ...i){
        //求不知道有几个数的和
        int sum = 0;
        for (int i1 : i) {
            sum+=i1;
        }
        return sum;
    }
}
