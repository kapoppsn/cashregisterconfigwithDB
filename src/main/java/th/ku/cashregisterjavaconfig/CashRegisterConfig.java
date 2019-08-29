package th.ku.cashregisterjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashRegisterConfig {

    @Bean
    public TaxCalculator caTaxCalculator(){
        return new CATaxCalculator();
    }

    @Bean
    public TaxCalculator nyTaxCalculator(){
        return new NYTaxCalculator();
    }

    @Bean
    public CashRegister cashRegister(){
        return new CashRegister("CA", caTaxCalculator());
    }
}
