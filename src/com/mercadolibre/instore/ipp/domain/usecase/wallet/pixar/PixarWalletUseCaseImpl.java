package com.mercadolibre.instore.ipp.domain.usecase.wallet.pixar;

import com.mercadolibre.instore.ipp.domain.model.Wallet;
import com.mercadolibre.instore.ipp.domain.usecase.wallet.WalletUseCase;

import java.util.List;

public class PixarWalletUseCaseImpl implements WalletUseCase {
    @Override
    public boolean canHandle() {
        return false;
    }

    @Override
    public void createWallet(Wallet wallet) {

    }

    @Override
    public Wallet updateWallet(Wallet wallet) {
        return null;
    }

    @Override
    public void deleteById(Wallet wallet) {

    }

    @Override
    public Wallet getById(String walletId) {
        return null;
    }

    @Override
    public List<Wallet> getAll() {
        return null;
    }
}
