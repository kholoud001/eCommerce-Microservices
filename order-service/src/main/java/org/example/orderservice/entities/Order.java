    package org.example.orderservice.entities;

    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;
    import org.example.productservice.entities.Product;

    import java.util.ArrayList;
    import java.util.List;

    @Entity
    @Setter
    @Getter
    @AllArgsConstructor
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
