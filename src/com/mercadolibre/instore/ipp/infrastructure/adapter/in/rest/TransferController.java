package com.mercadolibre.instore.ipp.infrastructure.adapter.in.rest;

import com.mercadolibre.instore.ipp.application.port.in.TransferService;
import com.mercadolibre.instore.ipp.domain.dto.TransferRequestDto;

public class TransferController {

    //REST CONTROLLER
    private TransferService transferService;

    public Object transfer(final TransferRequestDto transferRequestDto) {
        return transferService.transfer(transferRequestDto);
    }
}
