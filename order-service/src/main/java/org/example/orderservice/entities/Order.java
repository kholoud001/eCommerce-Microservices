    package org.example.orderservice.entities;

    import jakarta.persistence.*;
    import lombok.*;
    import org.example.productservice.entities.Product;

    import java.util.ArrayList;
    import java.util.List;

    @Entity
    @Setter
    @Getter
    @AllArgsConstructor
    @Builder
    @NoArgsConstructor
    public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @ElementCollection
        private List<Long> productIds = new ArrayList<>();
        private long price;
        private boolean isPaid = false;

    }
