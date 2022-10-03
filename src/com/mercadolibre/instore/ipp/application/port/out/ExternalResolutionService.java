package com.mercadolibre.instore.ipp.application.port.out;

import com.mercadolibre.instore.ipp.domain.model.ExternalResolution;
import com.mercadolibre.instore.ipp.domain.model.ResolutionType;

import java.util.Optional;

/**
 * Interface created to define contract for external resolution strategy mapping
 */
public interface ExternalResolutionService {

    /**
     * Checks whether an implementation of this class can deal with resolution Type
     * @param resolutionType the resolution type
     * @return boolean true or false
     */
    boolean canResolve(ResolutionType resolutionType);

    Optional<ExternalResolution> resolve(String request);
}
