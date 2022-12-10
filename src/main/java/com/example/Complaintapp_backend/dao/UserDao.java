package com.example.Complaintapp_backend.dao;

import com.example.Complaintapp_backend.model.UserModel;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel,Integer> {
}
