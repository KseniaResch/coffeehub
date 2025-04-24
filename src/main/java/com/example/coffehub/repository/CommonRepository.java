package com.example.coffehub.repository;

import com.example.coffehub.exception.DatabaseException;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import jakarta.persistence.Query;

import javax.xml.crypto.Data;
import java.util.List;

@Repository
public class CommonRepository {
    protected final EntityManager entityManager;

    public CommonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected List execute(Query query) {
        try{
            return query.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new DatabaseException(e.getMessage());
        }
    }
}
