package com.camsoft.smartpos.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: chhai.chivon on 6/27/2018.
 */
@Data
@Entity
@Table(name = "TU_USER")
public class User extends BaseModel{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private int userId;
    private String username;
    private String email;
    private String password;
    private int roleId;
    private int companyId;
}
