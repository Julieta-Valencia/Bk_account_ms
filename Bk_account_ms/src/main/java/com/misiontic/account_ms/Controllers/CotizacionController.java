package com.misiontic.account_ms.Controllers;
import com.misiontic.account_ms.models.Cotizacion;
import com.misiontic.account_ms.repositories.CotizacionRepository;
import org.springframework.web.bind.annotation.*;

@RestController

public class CotizacionController {
    private final CotizacionRepository Cotizacion;
    public CotizacionController(CotizacionRepository CotizacionRepository) {
        this.Cotizacion = CotizacionRepository;
    }
    @GetMapping("/price/{concept}")
    Cotizacion getAccount(@PathVariable String concept){
        return Cotizacion.findByConcept(concept).get(0);
    }

    @PostMapping("/price")
    Cotizacion newAccount(@RequestBody Cotizacion cotizacion){
        return Cotizacion.save(cotizacion);
    }

}

