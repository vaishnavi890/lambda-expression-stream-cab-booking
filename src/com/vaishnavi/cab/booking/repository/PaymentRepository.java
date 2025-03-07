package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.Payment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PaymentRepository {
    private final List<Payment> payments = new ArrayList<>();

    public void save(Payment payment) {
        payments.add(payment);
        System.out.println("Payment recorded successfully.");
    }

    public List<Payment> findAll() {
        return payments.stream().toList();
    }

    public Optional<Payment> findById(int paymentId) {
        return payments.stream().filter(payment -> payment.paymentId() == paymentId).findFirst();
    }

    public List<Payment> getSuccessfulPayments() {
        return payments.stream()
                .filter(payment -> "SUCCESS".equalsIgnoreCase(payment.status()))
                .toList();
    }
}
