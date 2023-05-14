package GestorDependencias;
import lombok.Data;
import lombok.NonNull;
import java.time.LocalDate;
@Data
public class PersonaData {
    @NonNull private String nombre;
    @NonNull private String apellido;
    @NonNull private LocalDate fechaNacimiento;
}
