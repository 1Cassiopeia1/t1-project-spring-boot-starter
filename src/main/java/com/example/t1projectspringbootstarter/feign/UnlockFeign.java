package com.example.t1projectspringbootstarter.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "unlock-service", url = "${services.unlock-service.url}")
public interface UnlockFeign {

    @PostMapping("/unlock/account/{accountId}")
    boolean unlockAccount(@PathVariable Long accountId);

    @PostMapping("/unlock/client/{clientId}")
    boolean unlockClient(@PathVariable Long clientId);
}
