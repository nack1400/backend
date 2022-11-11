package tds.backend.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import tds.backend.entity.Store;

@Repository
@RequiredArgsConstructor
public class StoreRepository {

  private final EntityManager em;

  public void save(Store store) { // insert
    em.persist(store);
  }

  public Store findOne(String id) { // select 
    return em.find(Store.class, id);
  }

  public List<Store> findAll() { // select *
    return em.createQuery("select m from Store m", Store.class).getResultList();
  }
}
