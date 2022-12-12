package cinema.dto.response;

import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String email;
    private Set<Long> roleId;
}
