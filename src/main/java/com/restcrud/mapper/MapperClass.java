package com.restcrud.mapper;

import com.restcrud.dto.InternDto;
import com.restcrud.entity.InternEntity;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;


@NoArgsConstructor
@Builder(toBuilder = true)
public class MapperClass {

    public static InternEntity toEntity(InternDto internDto){
        return InternEntity.builder()
                .id(Optional.ofNullable(internDto.id()).orElse(UUID.randomUUID()))
                .fullname(internDto.fullname())
                .address(internDto.address())
                .build();
    }
    public static InternDto toDto(InternEntity internentity){
        return InternDto.builder()
                .id(internentity.getId())
                .fullname(internentity.getFullname())
                .address(internentity.getAddress())
                .build();
    }
    public static List<InternDto> toDtoList(List<InternEntity> entity){
        return entity.stream().map(data-> toDto(data)).collect(Collectors.toList());
    }
}
