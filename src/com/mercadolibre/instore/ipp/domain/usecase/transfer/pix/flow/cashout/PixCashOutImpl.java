package com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.cashout;


import com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.PixFlowService;

public class PixCashOutImpl implements PixFlowService {

    @Override
    public boolean attends() {
        return false;
    }

    @Override
    public Object handle() {
        return null;
    }
}
