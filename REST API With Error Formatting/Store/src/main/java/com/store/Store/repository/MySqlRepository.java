package com.store.Store.repository;

import com.store.Store.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository extends JpaRepository<Address,Integer> {
}
