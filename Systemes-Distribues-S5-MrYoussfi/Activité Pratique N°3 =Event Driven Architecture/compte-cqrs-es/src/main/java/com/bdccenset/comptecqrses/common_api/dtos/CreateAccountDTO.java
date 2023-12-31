package com.bdccenset.comptecqrses.common_api.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CreateAccountDTO {
    private double initialBalance;
    private String currency;

}
