package com.Health.PathologyLabApplication.service;

import com.Health.PathologyLabApplication.dto.ResultEntryRequest;
import com.Health.PathologyLabApplication.entity.ResultEntry;

public interface ResultEntryService {
    ResultEntry saveResult(Long orderId, ResultEntryRequest request);

    ResultEntry getResultByOrder(Long orderId);
}
