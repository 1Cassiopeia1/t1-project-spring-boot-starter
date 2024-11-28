package com.example.t1projectspringbootstarter.dto;

import com.example.t1projectspringbootstarter.dto.enums.AccountStatus;
import com.example.t1projectspringbootstarter.dto.enums.AccountType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto implements Serializable {
    private Long clientId;
    private AccountType accountType;
    private String balance;
    private AccountStatus accountStatus;
    private String frozenAmount;
}