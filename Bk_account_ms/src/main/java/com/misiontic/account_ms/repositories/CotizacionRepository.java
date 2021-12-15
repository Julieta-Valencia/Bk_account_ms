package com.misiontic.account_ms.repositories;

import com.misiontic.account_ms.models.Cotizacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CotizacionRepository extends MongoRepository <Cotizacion,String> {

    List<Cotizacion> findByConcept(String concept);
}
