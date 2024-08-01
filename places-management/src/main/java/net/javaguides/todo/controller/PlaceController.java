package net.javaguides.todo.controller;

import lombok.AllArgsConstructor;
import net.javaguides.todo.dto.PlaceDto;
import net.javaguides.todo.service.PlaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api")
@AllArgsConstructor
public class PlaceController {

    private PlaceService placeService;

    @PostMapping("place")
    public ResponseEntity<PlaceDto> addPlace(@RequestBody PlaceDto placeDto){
        PlaceDto savedTodo = placeService.addPlace(placeDto);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping("place/{id}")
     public ResponseEntity<PlaceDto> getPlaceById(@PathVariable("id") Long placeId){
        PlaceDto returnedPlace = placeService.getPlace(placeId);
        return new ResponseEntity<>(returnedPlace, HttpStatus.OK);
     }

    @GetMapping("places/{userEmail}")
    public ResponseEntity<List<PlaceDto>> getAllPlacesByUserEmail(@PathVariable("userEmail") String userEmail){
        List<PlaceDto> returnedPlaces = placeService.getAllPlaces(userEmail);
        return ResponseEntity.ok(returnedPlaces);
    }






}
