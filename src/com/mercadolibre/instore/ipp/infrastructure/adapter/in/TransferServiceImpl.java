package com.mercadolibre.instore.ipp.infrastructure.adapter.in;

import com.mercadolibre.instore.ipp.application.port.in.TransferService;
import com.mercadolibre.instore.ipp.domain.dto.TransferRequestDto;
import com.mercadolibre.instore.ipp.domain.dto.TransferResponseDto;
import com.mercadolibre.instore.ipp.domain.model.TransferRequest;
import com.mercadolibre.instore.ipp.domain.usecase.transfer.TransferUseCase;

import java.util.List;

public class TransferServiceImpl implements TransferService {

    private List<TransferUseCase> useCases;

    @Override
    public TransferResponseDto transfer(final TransferRequestDto request) {
        final TransferRequest model = request.toModel();

        final TransferUseCase transferUseCase = useCases.stream()
            .filter(uc -> uc.canHandle(model))
            .findFirst()
            .orElseThrow(RuntimeException::new);

        return TransferResponseDto.fromModel(transferUseCase.transfer(model));
    }
}
