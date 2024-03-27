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
public class Ressource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRessources;
    Date Date_ajout;
    String Description;
    Type Type;
    @Lob
    private byte[] content;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Studygroup> Studygroups;
}
