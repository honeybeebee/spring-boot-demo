package com.xulinfeng.framework.dao.entity;

import java.io.Serializable;

/**
 * 基础类
 *
 * @author linfeng
 * @create 2018-06-12 0:27
 */
public abstract class BaseEntity implements Serializable {

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
