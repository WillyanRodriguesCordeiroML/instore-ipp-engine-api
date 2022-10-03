package com.mercadolibre.instore.ipp.domain.usecase.transfer.pixar;

import com.mercadolibre.instore.ipp.application.port.out.ExternalResolutionService;
import com.mercadolibre.instore.ipp.domain.model.TransferRequest;
import com.mercadolibre.instore.ipp.domain.model.TransferResponse;
import com.mercadolibre.instore.ipp.domain.usecase.transfer.TransferUseCase;

import java.util.List;

public class PixarTransferUseCaseImpl implements TransferUseCase {

    //Inject auto wiring
    private List<ExternalResolutionService> externalResolutionServices;

    @Override
    public boolean canHandle(final TransferRequest request) {
        return false;
    }

    @Override
    public TransferResponse transfer(final TransferRequest request) {
        return null;
    }
}
