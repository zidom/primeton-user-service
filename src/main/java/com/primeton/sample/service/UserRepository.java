package com.primeton.sample.service;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href='mailto:huzd@primeton.com'>虎振东</a>
 * @date 2017/5/16 17:12.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
