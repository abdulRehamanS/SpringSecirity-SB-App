package In.Abdul.SpringSecurity.NGSB.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Spring_Security")
public class User {
    private int id;
    private String name;
    private String email;
    private String mobile;
}
