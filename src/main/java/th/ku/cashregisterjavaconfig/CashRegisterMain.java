package th.ku.cashregisterjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CashRegisterMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(CashRegisterConfig.class);
        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(200);
        register.recordPurchase(50);
        System.out.println(register.getTotal());

    }

}
