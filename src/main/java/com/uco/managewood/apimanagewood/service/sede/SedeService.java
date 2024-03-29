package com.uco.managewood.apimanagewood.service.sede;


import com.uco.managewood.apimanagewood.domain.sede.Sede;
import com.uco.managewood.apimanagewood.repository.sede.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeService{


    @Autowired
    private SedeRepository sedeRepository;

    //FINDALL
    public List<Sede> findAll() {
        return sedeRepository.findAll();
    }

    public Optional<Sede> findById(Integer codigo){
        return sedeRepository.findById(codigo);
    }

    public Sede saveSede(Sede sede){
        return sedeRepository.save(sede);
    }

    public void deleteSede(Integer codigo){
        sedeRepository.deleteById(codigo);
    }



    public Sede updateSede(int codigosede, Sede nuevaSede) {
        Optional<Sede> sedeOptional = sedeRepository.findById(codigosede);

        if (sedeOptional.isPresent()) {
            Sede sedeExistente = sedeOptional.get();
            // Actualizar los campos necesarios de la sede existente con los valores de nuevaSede
            sedeExistente.setNombre(nuevaSede.getNombre());
            sedeExistente.setCodigoempresa(nuevaSede.getCodigoempresa());
            sedeExistente.setCodigociudad(nuevaSede.getCodigociudad());
            return sedeRepository.save(sedeExistente);
        } else {
            // Manejar el caso en que la sede no se encuentra
            throw new RuntimeException("Sede no encontrada con el código: " + codigosede);
        }
    }

}
