package com.ssafy.howdoilook.domain.clothes.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ClothesSaveRequestDto {

    private Long userId;
    private String type;
    private String photoLink;
    private String name;
    private String brand;
    private String info;

}
