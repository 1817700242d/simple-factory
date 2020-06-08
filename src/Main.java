import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Classname Main
 * @Description 简单工厂模式入口类
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/3 22:59
 */
public class Main {
    public static void main(String[]args){
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;
        inputStreamReader = new InputStreamReader(System.in);
        bufferedReader =new BufferedReader(inputStreamReader);
        try {
        System.out.println("输入数字A");
        Double numberA =Double.parseDouble(bufferedReader.readLine()) ;
        System.out.println("输入操作符 如 + - * / ");
        String operator = bufferedReader.readLine();
        System.out.println("输入数字C");
        Double numberB= Double.parseDouble(bufferedReader.readLine());
        Operation oper = OperationFactory.creatOperation(operator);
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        System.out.println("结果是"+oper.getResult());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
