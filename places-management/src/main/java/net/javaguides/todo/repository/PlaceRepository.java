package net.javaguides.todo.repository;

import net.javaguides.todo.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaceRepository extends JpaRepository<Place, Long> {

  List<Place> findAllPlacesByUserEmail(String userEmail);
}
