package com.exam.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;

public class UserRoleTest {

    @Test
    public void testGettersAndSetters() {
        // Create a user role
        UserRole userRole = new UserRole();
        userRole.setUserRoleId(1L);
        User user = new User();
        user.setUsername("testuser");
        userRole.setUser(user);
        Role role = new Role();
        role.setRoleId(1L);
        userRole.setRole(role);

        // Verify getters
        assertEquals(Long.valueOf(1L), userRole.getUserRoleId());
        assertEquals("testuser", userRole.getUser().getUsername());
        assertEquals(Long.valueOf(1L), userRole.getRole().getRoleId());
    }
}
