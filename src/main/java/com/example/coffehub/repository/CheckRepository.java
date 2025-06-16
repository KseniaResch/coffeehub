package com.example.coffehub.repository;

import com.example.coffehub.entity.CheckEntity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class CheckRepository extends CommonRepository {


    public CheckRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public static void save(CheckEntity check) {
    }
}
