package com.moremore.domain.config.auth.dto;

import com.moremore.domain.user.Role;
import com.moremore.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String email;
    private String name;
    private String picture;
    private String roleKey;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
        this.roleKey = user.getRoleKey();
    }
}
