package com.xzit.core.listener;


import com.xzit.core.entity.BaseEntity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

/**
 * EntityListener - 创建日期、修改日期、版本处理
 *
 * @author Lijin
 * @version 1.0.0
 */
public class EntityListener {

    @PrePersist
    public void prePersist(BaseEntity<?> entity) {
        entity.setCreateDate(new Date());
        entity.setCreatedId(1L);
        entity.setCreatedName("monco");
        entity.setUpdateDate(new Date());
        entity.setUpdatedId(1L);
        entity.setUpdatedName("monco");
        entity.setDataDelete(0);
        entity.setDataStatus(1);
        entity.setVersion(0L);
    }

    @PreUpdate
    public void preUpdate(BaseEntity<?> entity) {
        entity.setUpdateDate(new Date());
        entity.setUpdatedId(1L);
        entity.setUpdatedName("monco");
    }
}