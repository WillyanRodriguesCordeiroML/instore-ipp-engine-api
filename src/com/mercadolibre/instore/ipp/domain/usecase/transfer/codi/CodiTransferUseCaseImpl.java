package com.mercadolibre.instore.ipp.domain.usecase.transfer.codi;

import com.mercadolibre.instore.ipp.application.port.out.ExternalResolutionService;
import com.mercadolibre.instore.ipp.domain.model.TransferRequest;
import com.mercadolibre.instore.ipp.domain.model.TransferResponse;
import com.mercadolibre.instore.ipp.domain.usecase.transfer.TransferUseCase;

import java.util.List;

public class CodiTransferUseCaseImpl implements TransferUseCase {

    //Inject auto wiring
    private List<ExternalResolutionService> externalResolutionServices;

    @Override
    public boolean canHandle(TransferRequest request) {
        return false;
    }

    @Override
    public TransferResponse transfer(TransferRequest request) {
        return null;
    }
}
