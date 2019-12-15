package com.example.demo.a2.mysql.service;

public interface MappingService<T, U> {

    T mapToEntity(U model);

    T mapToEntity(T entity, U model);

    U mapToModel(T entity);

}
