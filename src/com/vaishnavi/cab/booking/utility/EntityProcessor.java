package com.vaishnavi.cab.booking.utility;

@FunctionalInterface
public interface EntityProcessor<T> {
    void process(T entity);
}
