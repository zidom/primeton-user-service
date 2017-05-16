package com.primeton.sample.service;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/5/16 17:09.
 */
@Data
@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private String age;

}
