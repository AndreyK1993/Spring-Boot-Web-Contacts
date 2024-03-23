package app.SpringBootWebContacts.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contacts")
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "image")
    private String img;
    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone")
    private String phone;
}
