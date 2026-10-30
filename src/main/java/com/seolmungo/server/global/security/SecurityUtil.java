package com.seolmungo.server.global.security;

import com.seolmungo.server.global.exception.ErrorCode;
import com.seolmungo.server.global.exception.GeneralException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public final class SecurityUtil {

    private SecurityUtil() {
    }

    public static Long getCurrentUserId() {
        Authentication authentication = SecurityContextHolder
            .getContext()
            .getAuthentication();

        if (authentication == null
            || !authentication.isAuthenticated()
            || !(authentication.getPrincipal() instanceof Long userId)) {
            throw new GeneralException(ErrorCode.UNAUTHORIZED);
        }

        return userId;
    }
}
