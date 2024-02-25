package com.spring.boot.learning.springboottestingtypes.domain;

import org.springframework.data.jpa.repository.JpaRepository;

interface CustomerRepository extends JpaRepository<Customer, Long> {
}
