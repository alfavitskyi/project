package testgroup.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table
class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String address;
    private Integer houseNumb;
    private Integer appQuantity;

}
