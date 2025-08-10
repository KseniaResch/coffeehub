package com.example.coffehub.repository;

import com.example.coffehub.entity.CheckEntity;
import com.example.coffehub.entity.ProductEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
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

        Query query = entityManager.createNativeQuery("call coffe_hub.getActiveCheck(?)", CheckEntity.class);
        query.setParameter(1, checkId);
        List<?> result = execute(query);
        if(result.size() == 0) {
            return null;

        }

        return  (CheckEntity)result.get(0);

    }

    public void closeCheck(Integer checkId) {
        Query q = entityManager.createNativeQuery("CALL coffe_hub.close_check(?)");
        q.setParameter(1, checkId);
        execute(q);


    }

    public CheckEntity openCheck(Integer locationId) {
        Query q = entityManager.createNativeQuery("CALL coffe_hub.open_check(?)", CheckEntity.class);
        q.setParameter(1, locationId);
        return (CheckEntity) execute(q).get(0);
    }


}

