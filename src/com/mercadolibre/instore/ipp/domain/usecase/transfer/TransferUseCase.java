package com.mercadolibre.instore.ipp.domain.usecase.transfer;

import com.mercadolibre.instore.ipp.domain.model.TransferRequest;
import com.mercadolibre.instore.ipp.domain.model.TransferResponse;

public interface TransferUseCase {

    boolean canHandle(TransferRequest request);

    TransferResponse transfer(TransferRequest request);
}
