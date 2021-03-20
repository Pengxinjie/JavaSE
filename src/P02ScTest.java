import java.util.Scanner;

/**
 * @author Pengxinjie
 * @DATE 2021/3/19 - 7:17
 */
public class P02ScTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //next和nextline
        //next：空格结束
        //nextline：回车结束,可以获取空格
        if (scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输出的内容："+str);
        }

        System.out.println("-------------------------------------------");
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容："+str);
        }
        scanner.close();
    }
}
