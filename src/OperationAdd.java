/**
 * @Classname OperationAdd
 * @Description TODO  加法类的实现
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/3 23:19
 */
public class OperationAdd extends Operation{

    public double getResult(){
        double result = 0;
        result = getNumberA() + getNumberB();
        return  result;
    }
}
