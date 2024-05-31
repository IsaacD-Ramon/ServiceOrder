package org.acme.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class OrderDTO {

    private Long CustomerId;

    private String CustomerName;

    private Long ProductId;

    private BigDecimal orderValue;
}
