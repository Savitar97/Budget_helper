package result.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DataModel {
  
   @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String username;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false)
    private ZonedDateTime created;

    @Column(nullable = false)
    private String description;

    @Column
    private String comment;
  
     @PrePersist
    protected void onPersist() {
        created = ZonedDateTime.now();
    }
}
