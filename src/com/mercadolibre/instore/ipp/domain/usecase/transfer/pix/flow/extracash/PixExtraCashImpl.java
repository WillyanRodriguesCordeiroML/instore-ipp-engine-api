package com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.extracash;

import com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.PixFlowService;

public class PixExtraCashImpl implements PixFlowService {

    @Override
    public boolean attends() {
        return false;
    }

    @Override
    public Object handle() {
        return null;
    }
}
