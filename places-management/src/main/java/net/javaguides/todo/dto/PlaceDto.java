package net.javaguides.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PlaceDto {

    private Long id;
    private String title;
    private String imageUri;
    private String address;
    private Double lat;
    private Double lng;
    private String userEmail;
}
