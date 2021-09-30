package com.smfssilva.cursomc.services;

import com.smfssilva.cursomc.domain.Estado;
import com.smfssilva.cursomc.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository repo;

    public List<Estado> findAll(){
        return repo.findAllByOrderByNome();
    }
}
