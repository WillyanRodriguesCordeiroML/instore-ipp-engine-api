package com.mercadolibre.instore.ipp.domain.usecase.transfer.pix;

import com.mercadolibre.instore.ipp.application.port.out.ExternalResolutionService;
import com.mercadolibre.instore.ipp.application.port.out.FinancialIdentityService;
import com.mercadolibre.instore.ipp.application.port.out.LimitService;
import com.mercadolibre.instore.ipp.domain.model.TransferRequest;
import com.mercadolibre.instore.ipp.domain.model.TransferResponse;
import com.mercadolibre.instore.ipp.domain.usecase.transfer.TransferUseCase;
import com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.PixFlowService;

import java.util.List;

public class PixTransferUseCaseImpl implements TransferUseCase {

    //Inject auto wiring
    private LimitService limitService;

    //Inject auto wiring
    private List<ExternalResolutionService> externalResolutionServices;

    //Inject auto wiring
    private FinancialIdentityService financialIdentityService;

    //Inject auto wiring
    private List<PixFlowService> pixFlowServices;

    @Override
    public boolean canHandle(final TransferRequest request) {
        return false;
    }

    @Override
    public TransferResponse transfer(final TransferRequest request) {
        return null;
    }
}
