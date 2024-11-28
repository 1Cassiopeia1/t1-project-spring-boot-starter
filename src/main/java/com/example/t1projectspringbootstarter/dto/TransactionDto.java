package com.example.t1projectspringbootstarter.dto;

import com.example.t1projectspringbootstarter.dto.enums.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDto implements Serializable {
    private Long accountId;
    private String amount;
    private LocalTime executionTime;
    private TransactionStatus transactionStatus;
    private LocalDateTime timestamp;
}
