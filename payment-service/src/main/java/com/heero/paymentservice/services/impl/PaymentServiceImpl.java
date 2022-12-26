package com.heero.paymentservice.services.impl;

import com.heero.paymentservice.model.Payment;
import com.heero.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
       log.info("PaymentServiceImpl Recebi o pagamento {}", payment);
    }
}
