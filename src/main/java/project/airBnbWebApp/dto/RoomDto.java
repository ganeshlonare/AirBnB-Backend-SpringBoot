package project.airBnbWebApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.airBnbWebApp.entity.Hotel;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {
    private Long id;
    private Hotel hotel;
    private String type;
    private BigDecimal basePrice;
    private String photos;
    private String amenities;
    private Integer totalCount;
    private Integer capacity;
}
