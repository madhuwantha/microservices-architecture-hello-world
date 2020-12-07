package com.equtiem.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Long departmentId;
    private String deprtmentName;
    private String deprtmentAddress;
    private String deprtmentCode;
}
