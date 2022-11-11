package tds.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tds.backend.entity.Store;
import tds.backend.repository.StoreRepository;

@Service
@RequiredArgsConstructor
public class StoreService {
  
  private final StoreRepository storeRepository;

  // add store
  public String joinStore (Store store){
    storeRepository.save(store);
    return store.getMapId();
  }

  // check whole stores
  public List<Store> findStores(){
    return storeRepository.findAll();
  }


}
