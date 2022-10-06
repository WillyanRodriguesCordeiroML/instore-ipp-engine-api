package com.mercadolibre.instore.ipp.infrastructure.adapter.out.storage;

import com.mercadolibre.instore.ipp.application.port.out.WalletManagementService;
import com.mercadolibre.instore.ipp.domain.model.Wallet;

import java.util.List;

public class PixarWalletManagementServiceImpl implements WalletManagementService<Wallet> {

    @Override
    public void save(Wallet wallet) {

    }

    @Override
    public List<Wallet> getAll() {
        return null;
    }

    @Override
    public Wallet get() {
        return null;
    }

    @Override
    public void delete(Wallet wallet) {

    }
}
