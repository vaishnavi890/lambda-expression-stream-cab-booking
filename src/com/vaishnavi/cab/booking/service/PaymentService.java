package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private final List<Payment> payments = new ArrayList<>();

    public void processPayment(Payment payment) {
        payments.add(payment);
        System.out.println("Payment processed: " + payment);
    }

    public List<Payment> getSuccessfulPayments() {
        return payments.stream().filter(p -> "SUCCESS".equalsIgnoreCase(p.status())).toList();
    }

    public void printPayments() {
        int i = 0;
        do {
            if (payments.isEmpty()) {
                System.out.println("No payments available.");
                break;
            }
            System.out.println(payments.get(i));
            i++;
        } while (i < payments.size());
    }
}
