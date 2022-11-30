package com.restcrud.service;

import com.restcrud.dto.InternDto;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface InternService {
    InternDto addIntern(InternDto internDto);
    InternDto findById(String id);

    List<InternDto> findAllIntern();

    void deleteById(@NotNull String id);
}
