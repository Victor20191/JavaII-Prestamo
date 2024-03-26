package com.ps.services;

import com.ps.model.Prestamo;

public interface IPrestamoService {

    public Prestamo registrar(Prestamo prestamo);

    Prestamo getPrestamoById(Long id);

    Prestamo createPrestamo(Prestamo prestamo);

    Prestamo updatePrestamo(Prestamo prestamo);

    void deletePrestamo(Long id);
}
