package com.example.coffehub.repository;

import com.example.coffehub.exception.DatabaseException;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import jakarta.persistence.Query;

import javax.xml.crypto.Data;
import java.util.List;

@Repository
public class CommonRepository {
    protected final EntityManager entityManager;
    static final Logger log = LoggerFactory.getLogger(CommonRepository.class);
    public CommonRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected List execute(Query query) {
        try{
            return query.getResultList();
        } catch (Exception e) {
            log.error("erorr in bd:\n"+ e.getMessage());
            throw new DatabaseException(e.getMessage());
        }
    }
}
