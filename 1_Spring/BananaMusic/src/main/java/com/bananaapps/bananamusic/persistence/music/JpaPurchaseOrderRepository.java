package com.bananaapps.bananamusic.persistence.music;

import com.bananaapps.bananamusic.domain.music.PurchaseOrder;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class JpaPurchaseOrderRepository implements PurchaseOrderRepository{
    @Override
    public PurchaseOrder getById(Long id) {
        return null;
    }

    @Override
    public Collection<PurchaseOrder> findAll() {
        return null;
    }

    @Override
    public PurchaseOrder save(PurchaseOrder order) {
        return null;
    }

    @Override
    public void delete(PurchaseOrder order) {

    }
}
