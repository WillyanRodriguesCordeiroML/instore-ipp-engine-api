package com.mercadolibre.instore.ipp.domain.usecase.wallet;

import com.mercadolibre.instore.ipp.domain.model.Wallet;

import java.util.List;

public interface WalletUseCase {

    boolean canHandle();
    void createWallet(Wallet wallet);
    Wallet updateWallet(Wallet wallet);
    void deleteById(Wallet wallet);
    Wallet getById(String walletId);
    List<Wallet> getAll();

}
