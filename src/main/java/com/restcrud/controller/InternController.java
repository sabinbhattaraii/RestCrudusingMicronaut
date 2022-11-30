package com.restcrud.controller;

import com.restcrud.dto.InternDto;
import com.restcrud.service.InternService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;
@Controller
public class InternController {
    @Inject
    InternService internService;

    @Post("/create")
    public InternDto createIntern(@Body InternDto body){
        var data = internService.addIntern(body);
        return data;
    }
    @Get("/{id}")
    public InternDto findById(@PathVariable String id){
        return internService.findById(id);
    }
    @Get("/list/getAllIntern")
    public List<InternDto> findAll(){
        return internService.findAllIntern();
    }
    @Delete("/{id}")
    public void deleteById(@PathVariable String id){
        internService.deleteById(id);
    }
}
