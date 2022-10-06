package com.mercadolibre.instore.ipp.application.port.out;

import com.mercadolibre.instore.ipp.domain.model.Wallet;

import java.util.List;

public interface WalletManagementService<T extends Wallet> {

    void save(T wallet);

    List<T> getAll();

    T get();

    void delete(T wallet);

}
