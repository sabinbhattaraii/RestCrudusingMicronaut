package com.restcrud.dto;
import lombok.Builder;

import java.util.UUID;


@Builder
public record InternDto(
        UUID id,
        String fullname,
        String address
){}
