package com.tiger.repository;
import com.tiger.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by nrh387 on 12/27/2016.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{

}
