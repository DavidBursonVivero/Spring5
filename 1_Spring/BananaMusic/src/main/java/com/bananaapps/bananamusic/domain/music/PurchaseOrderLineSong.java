package com.bananaapps.bananamusic.domain.music;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class PurchaseOrderLineSong {
    private Long lineNumber;
    private Song song;
    private Integer quantity;
    private Double unitPrice;

    @ManyToOne
    @JoinColumn(name="purchaseorder_id")
    private PurchaseOrder purchaseOrder;

    public PurchaseOrderLineSong(Song song, Integer quantity, Double unitPrice) {
    this.song = song;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
}

    public void setOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }
}
