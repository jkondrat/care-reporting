package org.motechproject.care.reporting.repository;

import java.util.List;
import java.util.Map;

public interface Repository {
    <T> Integer save(T instance);

    <T> T get(Class<T> entityClass, String fieldName, Object value);

    <T> void saveOrUpdateAll(List<T> instances);

    <T> void update(T instance);

    <T> List<T> findAllByField(Class<T> clazz, List<String> values, String fieldName);

    <T> T findByExternalPrimaryKey(Class<T> clazz, Object value);

    <T> T get(Class<T> entityClass, Map<String, Object> fieldMap, Map<String, String> aliasMapping);

    <T> void delete(T instance);

    Object execute(String query);
}
