package com.example.oAuth.security;

import com.example.oAuth.entities.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority  implements GrantedAuthority {
    private final Authority authority;
    @Override
    public String getAuthority() {
        return authority.getAuthority();
    }

    @Override
    public String toString() {
        return "SecurityAuthority{" +
                "authority=" + authority +
                '}';
    }
}
