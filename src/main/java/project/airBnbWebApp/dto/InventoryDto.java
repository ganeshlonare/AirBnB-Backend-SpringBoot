package project.airBnbWebApp.dto;

import project.airBnbWebApp.entity.Hotel;
import project.airBnbWebApp.entity.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InventoryDto {
    private Long id;
    private Hotel hotel;
    private Room room;
    private LocalDate date;
    private Integer bookedCount;
    private Integer totalCount;
    private BigDecimal surgeFactor;
    private BigDecimal price;
    private String city;
    private Boolean closed;
}
