package com.qaqtutu.jpah2.repository;

import com.qaqtutu.jpah2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: 张家尧
 * @create: 2021/06/26 11:11
 */
public interface UserRepository extends JpaRepository<User, Long> {

}