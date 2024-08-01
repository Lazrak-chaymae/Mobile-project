package net.javaguides.todo.service;

import net.javaguides.todo.dto.PlaceDto;

import java.util.List;

public interface PlaceService {

    PlaceDto addPlace(PlaceDto placeDto);
    PlaceDto getPlace(Long id);
    List<PlaceDto> getAllPlaces(String userEmail);

}
