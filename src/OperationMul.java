/**
 * @Description TODO
 * @Date 2020-03-27
 * @Author MaWeiJun
 * @Version 1.0
 */
public class OperationMul extends Operation {
    public double getResult() {
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}