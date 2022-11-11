package tds.backend;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import tds.backend.entity.Store;
import tds.backend.repository.StoreRepository;
import tds.backend.service.StoreService;

@SpringBootTest
@Transactional
class BackendApplicationTests {

  @Autowired
  StoreService storeService;
  @Autowired
  StoreRepository storeRepository;
  @Autowired
  EntityManager em;

	@Test
	public void join() throws Exception {
    Store store = new Store();
    store.setMapId("A");
    store.setStoreName("B");
    // System.out.println(store.getMapId());

    String savedId = storeService.joinStore(store);
    System.out.println(savedId);
	}

}
