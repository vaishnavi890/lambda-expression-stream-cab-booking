package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.Payment;
import com.vaishnavi.cab.booking.service.PaymentService;
import com.vaishnavi.cab.booking.utility.EntityProcessor;

public class PaymentController {
    private final PaymentService paymentService = new PaymentService();

    public void processPayment(int paymentId, int rideId, int userId, double amount, String method, String status) {
        Payment payment = new Payment(paymentId, rideId, userId, amount, method, status);
        EntityProcessor<Payment> processor = paymentService::processPayment;
        processor.process(payment);
    }
}
