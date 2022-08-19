package com.expample.loan.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerVo {
    private int custId;
    private String customerName;
    private int email;
    private double mobile;
    private String address;
}
