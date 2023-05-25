package com.example.springdata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalTime;
import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Getter
@Setter
public class Order extends BaseEntity {

    @Column(name = "order_time", nullable = false)
    private LocalTime orderTime;

    @Column(name = "payed_status")
    private Boolean payedStatus;

    @ManyToOne
    private Tables table;

    @ManyToOne
    private Waiter waiters;

    @ManyToMany
    @JoinTable(
        name = "orders_products",
        joinColumns = { @JoinColumn(name = "order_id") },
        inverseJoinColumns = { @JoinColumn(name = "product_id") })
    private Set<Product> products;

    @ManyToMany
    @JoinTable(
        name = "orders_clients",
        joinColumns = { @JoinColumn(name = "order_id") },
        inverseJoinColumns = { @JoinColumn(name = "client_id") })
    private Set<Client> clients;
}
