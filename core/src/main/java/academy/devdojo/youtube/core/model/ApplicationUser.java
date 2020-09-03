package academy.devdojo.youtube.core.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationUser implements AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull(message = "Thi field 'username' is mandatory")
    @Column(nullable = false)
    private String userName;
    @NotNull(message = "Thi field 'password' is mandatory")
    @Column(nullable = false)
    private String password;
    @NotNull(message = "Thi field 'role' is mandatory")
    @Column(nullable = false)
    private String role = "USER";

    public ApplicationUser(@NotNull ApplicationUser applicationUser) {
        this.id = applicationUser.getId();
        this.userName = applicationUser.getUserName();
        this.password = applicationUser.getPassword();
        this.role = applicationUser.getRole();
    }
}
