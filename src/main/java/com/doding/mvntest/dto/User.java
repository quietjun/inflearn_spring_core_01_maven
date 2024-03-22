package com.doding.mvntest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
// @Slf4j logging framework 설정 필요
public class User {
    private @NonNull String userId;
    private @NonNull String userPass;
    private int age;
    private String addr;
}
