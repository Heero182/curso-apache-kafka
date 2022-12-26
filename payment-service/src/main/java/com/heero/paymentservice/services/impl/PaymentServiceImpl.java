package com.heero.paymentservice.services.impl;

import com.heero.paymentservice.model.Payment;
import com.heero.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
       log.info("Recebi o pagamento {}", payment);
       Thread.sleep(1000);

       log.info("Sending payment...");

        kafkaTemplate.send("payment-topic", payment);

    }
}
