package com.exam.model;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class UserTest {

    @Test
    public void testGetAuthorities() {
        // Create a user with roles
        User user = new User();
        UserRole userRole = new UserRole();
        userRole.setRole(new Role(1L, "ROLE_USER")); // Assuming Role constructor takes roleId and roleName
        Set<UserRole> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setUserRoles(userRoles);

        // Verify authorities
        Set<String> expectedAuthorities = new HashSet<>();
        expectedAuthorities.add("ROLE_USER");

        // Extract authority strings from user's authorities for comparison
        Set<String> userAuthorityStrings = new HashSet<>();
        user.getAuthorities().forEach(authority -> userAuthorityStrings.add(authority.getAuthority()));

        assertEquals(expectedAuthorities, userAuthorityStrings);
    }
}
