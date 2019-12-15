package com.example.demo.a2.mysql.service;

import com.example.demo.a2.mysql.web.model.AddressModel;
import com.example.demo.a2.mysql.web.model.UserModel;
import com.example.demo.jpa.entity.Address;
import com.example.demo.jpa.entity.User;
import org.springframework.stereotype.Service;

@Service
public class MappingServiceImpl<T, U> implements MappingService<T, U> {

    @SuppressWarnings("unchecked")
    @Override
    public T mapToEntity(U model) {
        if (model instanceof UserModel) {
            return mapToEntity((T) new User(), model);
        } else if (model instanceof AddressModel) {
            return mapToEntity((T) new Address(), model);
        } else {
            return null;
        }
    }

    @Override
    public T mapToEntity(T entity, U model) {
        if (entity instanceof User && model instanceof UserModel) {
            final UserModel u = (UserModel) model;

            final User t = entity != null ? (User) entity : new User();
            t.setFirstName(u.getUsername());

            return (T) t;
        } else if (entity instanceof Address && model instanceof AddressModel) {
            final AddressModel u = (AddressModel) model;

            final Address t = entity != null ? (Address) entity : new Address();

            return (T) t;
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public U mapToModel(T entity) {
        if (entity instanceof User) {
            final User t = (User) entity;

            final UserModel u = new UserModel();
            u.setUsername(t.getFirstName() + " :: " + t.getLastName());

            return (U) u;
        } else if (entity instanceof Address) {
            final Address t = (Address) entity;

            final AddressModel u = new AddressModel();

            return (U) u;
        } else {
            return null;
        }

    }
}
