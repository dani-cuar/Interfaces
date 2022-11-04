package com.company;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);
    List<Coche> find();
    void delete(Coche coche);
}
