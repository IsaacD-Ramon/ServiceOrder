package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.Id;
import org.acme.repository.OrderRepository;

@ApplicationScoped
public class OrderService {

    @Inject
    private OrderRepository orderRepository;

}
