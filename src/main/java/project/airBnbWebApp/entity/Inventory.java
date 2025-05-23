package project.airBnbWebApp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(
        uniqueConstraints = @UniqueConstraint(
                name = "unique_hotel_room_date",
                columnNames = {"hotel_id","room_id","date"})
)
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false ,name = "hotel_id")
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false , name="room_id")
    private Room room;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false, columnDefinition = "INTEGER DEFAULT 0")
    private Integer bookedCount;

    @Column(nullable = false)
    private Integer totalCount;

    @Column(nullable = false , precision = 5 , scale = 2)
    private BigDecimal surgeFactor;

    @Column(nullable = false , precision = 10 , scale = 2)
    private BigDecimal price; // basePrice * surgeFactor

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Boolean closed;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
