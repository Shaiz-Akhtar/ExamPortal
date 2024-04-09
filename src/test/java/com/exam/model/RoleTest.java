package com.exam.model;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.exam.model.Role;
import com.exam.model.UserRole;

public class RoleTest {

    @Test
    public void testGetUserRoles() {
        // Create a role with user roles
        Role role = new Role();
        UserRole userRole = new UserRole();
        userRole.setUserRoleId(1L);
        Set<UserRole> userRoles = new HashSet<>();
        userRoles.add(userRole);
        role.setUserRoles(userRoles);

        // Verify user roles
        assertEquals(userRoles, role.getUserRoles());
    }
}
