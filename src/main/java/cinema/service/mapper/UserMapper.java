package cinema.service.mapper;

import cinema.dto.response.UserResponseDto;
import cinema.model.User;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        responseDto.setRoleId(user.getRoles().stream()
                .map(r -> r.getId())
                .collect(Collectors.toSet()));
        return responseDto;
    }
}
