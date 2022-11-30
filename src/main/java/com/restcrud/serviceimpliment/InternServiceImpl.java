package com.restcrud.serviceimpliment;

import com.restcrud.dto.InternDto;
import com.restcrud.entity.InternEntity;
import com.restcrud.mapper.MapperClass;
import com.restcrud.repository.InternRepository;
import com.restcrud.service.InternService;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.UUID;


@Singleton
public class InternServiceImpl implements InternService {
    @Inject
    InternRepository internRepository;

    @Override
    public InternDto addIntern(InternDto internDto) {
        InternEntity internEntity = MapperClass.toEntity(internDto);
        return MapperClass.toDto(internRepository.save(internEntity));
    }

    @Override
    public InternDto findById(String id) {
        return internRepository.findById(UUID.fromString(id))
                .map(MapperClass::toDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public List<InternDto> findAllIntern() {
        return MapperClass.toDtoList((List<InternEntity>)
                internRepository.findAll());
    }

    @Override
    public void deleteById(String id) {
        internRepository.deleteById(UUID.fromString(id));
    }
}
