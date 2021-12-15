package com.misiontic.account_ms.models;

import org.springframework.data.annotation.Id;

public class Cotizacion {
@Id
    private String id;
    private String concept;
    private Double price;

    public Cotizacion(String id,String concept, Double price) {
        this.id = id;
        this.concept = concept;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
