package com.zalopay;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by thinhda.
 * Date: 2019-04-15
 */

public interface SlaService {
    Duration calculate(LocalDateTime begin, LocalDateTime end);
}
