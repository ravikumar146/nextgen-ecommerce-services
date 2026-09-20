package com.nextgen.ecommerce.reports.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reports")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Schema(
        name = "Report",
        description = "Represents an report placed by a customer in the e-commerce system."
)
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of report", example = "rept01")
    private Long id;
}
