package com.mercadolibre.instore.ipp.infrastructure.adapter.out.rest;

import com.mercadolibre.instore.ipp.application.port.out.ExternalResolutionService;
import com.mercadolibre.instore.ipp.domain.model.ExternalResolution;
import com.mercadolibre.instore.ipp.domain.model.ResolutionType;

import java.util.Optional;

public class IEPExternalResolutionServiceImpl implements ExternalResolutionService {
    @Override
    public boolean canResolve(ResolutionType resolutionType) {
        return false;
    }

    @Override
    public Optional<ExternalResolution> resolve(String request) {
        return Optional.empty();
    }
}
