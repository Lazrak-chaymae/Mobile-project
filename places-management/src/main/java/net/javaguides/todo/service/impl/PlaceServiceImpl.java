package net.javaguides.todo.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.todo.dto.PlaceDto;
import net.javaguides.todo.entity.Place;
import net.javaguides.todo.exception.ResourceNotFoundException;
import net.javaguides.todo.repository.PlaceRepository;
import net.javaguides.todo.service.PlaceService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private PlaceRepository placeRepository;

    private ModelMapper modelMapper;

    @Override
    public PlaceDto addPlace(PlaceDto placeDto) {

        Place place = modelMapper.map(placeDto, Place.class);
        Place savedPlace = placeRepository.save(place);
        PlaceDto savedPlaceDto = modelMapper.map(savedPlace, PlaceDto.class);

        return savedPlaceDto;
    }

    @Override
    public PlaceDto getPlace(Long id) {
       Place place =  placeRepository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException("Place not found with id:" + id));
       return modelMapper.map(place, PlaceDto.class);
    }

    @Override
    public List<PlaceDto> getAllPlaces(String userEmail) {
       List<Place> places = placeRepository.findAllPlacesByUserEmail(userEmail);

        return  places.stream()
                .map((place)-> modelMapper.map(place, PlaceDto.class))
                .collect(Collectors.toList());


    }



}
