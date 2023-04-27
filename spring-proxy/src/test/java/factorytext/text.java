package factorytext;

import com.lhx.DT.Calculator;
import com.lhx.DT.calculatorfactory;
import com.lhx.DT.calculatorimpl;
import org.junit.Test;

public class text {
@Test
    public void cc(){
    calculatorfactory calculator = new calculatorfactory(new calculatorimpl());
    //动态代理类不知道名字 但和目标代理类实现相同的接口
    Calculator proxy = (Calculator) calculator.getProxy();
     proxy.add(1, 2);

}
}
