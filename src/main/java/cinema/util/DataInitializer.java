package cinema.util;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@mail.com");
        user.setPassword("admin123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
        User bobUser = new User();
        bobUser.setEmail("bob@mail.com");
        bobUser.setPassword("1234");
        bobUser.setRoles(Set.of(userRole));
        userService.add(bobUser);
    }
}
