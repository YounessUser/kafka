package ma.cdgk.cnss.entity;

import javax.persistence.*;
@Entity
@Table(name = "Participants")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String code;
    private String sigle;
    private String label;
}
