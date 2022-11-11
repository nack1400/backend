package tds.backend.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Store {

  @Id
  @Column(name = "map_id")
  private String mapId;

  private String storeName;

  private String password;

  @OneToMany(mappedBy = "poiStore")
  private List<Poi> poi = new ArrayList<>(); //FK

  @OneToMany(mappedBy = "orderStore")
  private List<Order> orders = new ArrayList<>(); //FK

}
