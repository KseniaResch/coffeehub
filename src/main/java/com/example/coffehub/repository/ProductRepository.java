package com.example.coffehub.repository;

import com.example.coffehub.entity.ProductEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository extends CommonRepository {


    public ProductRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public void testConnection() {
        Query query = entityManager.createNativeQuery("select 1");
        List<?>result = execute(query);

    }
}
