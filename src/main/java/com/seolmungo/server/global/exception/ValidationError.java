package com.seolmungo.server.global.exception;

public record ValidationError(
    String field,
    String message
) {
}
