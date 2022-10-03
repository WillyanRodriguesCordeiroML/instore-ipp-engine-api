package com.mercadolibre.instore.ipp.application.port.in;

import com.mercadolibre.instore.ipp.domain.dto.TransferRequestDto;

public interface TransferService {

    Object transfer(TransferRequestDto request);
}
