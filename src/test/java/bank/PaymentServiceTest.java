package bank;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PaymentServiceTest {

    @Test
    public void shouldCreatePaymentService() {
        PaymentService testedObject = new PaymentService();

    }

    @Test
    public void shouldTransferOneHundred() {
        PaymentService testedObject = new PaymentService();

        Account from = new Account("id1",200);
        Account to = new Account("id2",300);

        testedObject.transferMoney(from,to,100);
        assertThat(from.balance).isEqualTo(100);

    }



}
