package aisco.paymentgateway;
import aisco.paymentgateway.core.PaymentGateway;

import java.lang.reflect.Constructor;
import java.util.logging.Logger;



public class PaymentGatewayFactory {
    private static final Logger LOGGER = Logger.getLogger(FinancialReportFactory.class.getName());

    private PaymentGatewayFactory()
    {

    }

    public static PaymentGateway createPaymentGateway(String fullyQualifiedName, Object... base)
    {   //FinancialReport record = (base.length==0) ? null: (FinancialReport) base[0];
        PaymentGateway record = null;
        {
            try {
                Class<?> clz = Class.forName(fullyQualifiedName);
                Constructor<?> constructor = clz.getDeclaredConstructors()[0];
                record = (FinancialReport) constructor.newInstance(base);
            } 
            catch (IllegalArgumentException e)
            {
                LOGGER.severe("Failed to create instance of Financial Report.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                LOGGER.severe("Failed to run: Check your constructor argument");
                System.exit(20);
            }
            catch (ClassCastException e)
            {   LOGGER.severe("Failed to create instance of Financial Report.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                LOGGER.severe("Failed to cast the object");
                System.exit(30);
            }
            catch (ClassNotFoundException e)
            {
                LOGGER.severe("Failed to create instance of Financial Report.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                LOGGER.severe("Class not Found");
                System.exit(40);
            }
            catch (Exception e)
            {
                System.out.println(e);
                LOGGER.severe("Failed to create instance of Financial Report.");
                LOGGER.severe("Given FQN: " + fullyQualifiedName);
                System.exit(50);
            }
        }
        else
        {
            System.out.println("Config Fail");
            System.exit(10);
        }
        return record;
    }

}
