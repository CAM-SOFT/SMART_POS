package com.camsoft.smartpos.model;

import javax.persistence.*;

/**
 * @aouth chhaichivon on 7/1/2018
 */
@Entity
@Table(name = "TB_CATEGORY")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CATEGORY_ID")
    private int categoryId;
}
