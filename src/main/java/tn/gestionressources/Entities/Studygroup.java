package tn.gestionressources.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Studygroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idGroup;
    Date Date_debut;
    String Topic;
    Level level;
    String Location;
    @ManyToMany(mappedBy = "Studygroups",cascade = CascadeType.ALL)
    private Set<Ressource> Ressources;
}
