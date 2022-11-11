package tds.backend.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import tds.backend.entity.Poi;

@Repository
@RequiredArgsConstructor
public class PoiRepository {

  private final EntityManager em;
  
  public void add(Poi poi){
    em.persist(poi);
  }

  public Poi findOne(Long id){
    return em.find(Poi.class, id);
  }

  public List<Poi> findAll() {
    return em.createQuery("select p from Poi p", Poi.class).getResultList();
  }
}
