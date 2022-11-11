package tds.backend.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

  @Id @GeneratedValue
  @Column(name = "order_id")
  private Long id;

  private LocalDateTime orderTime;

  private String orderNum;

  private String tableNum;

  private LocalDateTime completed;

  @ManyToOne
  @JoinColumn(name = "map_id")
  private Store orderStore;  //FK

  public static Order createOrder(String orderNum, String tableNum, Store store){
    Order order = new Order();
    order.setOrderTime(LocalDateTime.now());
    order.setOrderNum(orderNum);
    order.setTableNum(tableNum);
    order.setCompleted(null);
    order.setOrderStore(store);
    return order;
  }

  public void checkCompletedTime(Order order){
    order.setCompleted(LocalDateTime.now());
  }
}
