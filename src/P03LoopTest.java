/**
 * @author Pengxinjie
 * @DATE 2021/3/19 - 10:21
 */
public class P03LoopTest {
    //打印九九乘法表
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + "*" + i + "=" + j * i+"\t");
            System.out.println();
            //  \t的用法：补全当前字符串长度到8的整数倍，最少1个最多8个空格
        }


    }
}
