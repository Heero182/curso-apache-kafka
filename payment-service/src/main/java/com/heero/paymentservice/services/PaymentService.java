package com.heero.paymentservice.services;

import com.heero.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
