package com.golubev.analyzer.repo;

import com.golubev.analyzer.entity.AbstractEntity;

import java.util.List;

public class RepoImp implements Repo {

    protected List<AbstractEntity> entities;

    public List<AbstractEntity> getOrders() {
        return entities;
    }

    public void setOrders(List<AbstractEntity> entities) {
        this.entities = entities;
    }

    @Override
    public void add(AbstractEntity entity) {
        entities.add(entity);
    }
}
