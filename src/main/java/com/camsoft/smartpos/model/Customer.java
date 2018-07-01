package com.camsoft.smartpos.model;


import javax.persistence.*;
import java.util.Date;

/**
 * @author: chhai.chivon on 6/27/2018.
 */

@Entity
@Table(name = "TBL_CUSTOMER")
public class Customer extends BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private int customerId;

}
