package ru.otus.hibernate.service;

import ru.otus.hibernate.entity.DataSet;

public class DBServiceImpl implements DBService {
    public <T extends DataSet> void save(T user) {

    }

    public <T extends DataSet> T load(long id, T clazz) {
        return null;
    }
}