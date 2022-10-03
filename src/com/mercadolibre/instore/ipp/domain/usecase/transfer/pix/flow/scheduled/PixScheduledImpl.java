package com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.scheduled;

import com.mercadolibre.instore.ipp.application.port.out.SchedulePaymentsService;
import com.mercadolibre.instore.ipp.domain.usecase.transfer.pix.flow.PixFlowService;

public class PixScheduledImpl implements PixFlowService {

    //Inject auto wiring
    private SchedulePaymentsService schedulePaymentsService;

    @Override
    public boolean attends() {
        return false;
    }

    @Override
    public Object handle() {
        schedulePaymentsService.saveSchedule();
        return null;
    }
}
