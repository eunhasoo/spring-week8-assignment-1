package com.codesoom.assignment.errors;

/**
 * 토큰이 유효하지 않은 경우 던집니다.
 */
public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException(String token) {
        super("Invalid token: " + token);
    }
}
