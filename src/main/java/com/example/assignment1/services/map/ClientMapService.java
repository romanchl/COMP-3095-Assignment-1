package com.example.assignment1.services.map;


import com.example.assignment1.model.Client;
import com.example.assignment1.services.CrudService;

import java.util.Set;

public class ClientMapService extends AbstractMapService<Client,Long> implements CrudService<Client,Long> {

    @Override
    public Set<Client> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Client object) {
        super.delete(object);
    }

    @Override
    public Client save(Client object) {
        return super.save(object.getId(),object);
    }

    @Override
    public Client findById(Long id) {
        return super.findById(id);
    }
}
