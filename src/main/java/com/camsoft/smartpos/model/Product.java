package com.camsoft.smartpos.model;

import javax.persistence.*;

/**
 * @aouth chhaichivon on 7/1/2018
 */
@Entity
@Table(name = "TB_PRODUCT")
public class Product extends AbstractModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODUCT_ID")
    private int productId;
}
