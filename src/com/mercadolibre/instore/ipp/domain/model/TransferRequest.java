package com.mercadolibre.instore.ipp.domain.model;

public class TransferRequest {

    private TransferType type;
    private TransferName name;
    private ResolutionType resolutionType;

    public ResolutionType getResolutionType() {
        return resolutionType;
    }

    public TransferName getName() {
        return name;
    }

    public TransferType getType() {
        return type;
    }
}
