package tds.backend.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Poi {

  @Id @GeneratedValue
  private Long id; //PK

  private String poiName;

  @ManyToOne
  @JoinColumn(name = "map_id")
  private Store poiStore; //FK

}
