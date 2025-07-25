package com.example.coffehub.repository;

import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.entity.ProductEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public abstract class CheckRepository extends CommonRepository {


    public CheckRepository(EntityManager entityManager) {
        super(entityManager);
    }



    public void  addToCheck(Integer checkId, Integer locationId, Integer productId, Integer quantity){
        Query query = entityManager.createNativeQuery("call coffe_hub.addToCheck(?,?,?,?)");
        query.setParameter(1, checkId)
                .setParameter(2, locationId)
                .setParameter(3, productId)
                .setParameter(4, quantity);
    }



    public CheckEntity getActiveCheck(BigInteger checkId){

        Query query = entityManager.createNativeQuery("call coffe_hub.getActiveCheck(?)");
        query.setParameter(1, checkId);
        List<?> result = execute(query);
        if(result.size() == 0) {
            return null;

        }

        return  (CheckEntity)result.get(0);

    }
}

