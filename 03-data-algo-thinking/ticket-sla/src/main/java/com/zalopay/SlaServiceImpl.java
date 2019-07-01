package com.zalopay;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by thinhda.
 * Date: 2019-04-15
 */

public class SlaServiceImpl implements SlaService {
    @Override
    public Duration calculate(LocalDateTime begin, LocalDateTime end) {
        // TODO: calc working hours
        return Duration.ofHours(1);
    }
}
