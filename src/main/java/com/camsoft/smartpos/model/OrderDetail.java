package com.camsoft.smartpos.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @aouth chhaichivon on 7/1/2018
 */
@Data
@Entity
@Table(name = "TB_ORDER_DETAIL")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_DETAIL_ID")
    private int orderDetailId;
}
