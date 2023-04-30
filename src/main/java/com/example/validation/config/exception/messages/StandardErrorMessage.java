package com.example.validation.config.exception.messages;

import java.time.LocalDateTime;

public class StandardErrorMessage {
    private final int status;
    private final LocalDateTime timestamp = LocalDateTime.now();
    private final String path;
    private final String error;

    public StandardErrorMessage(int status, String path, String error) {
        this.status = status;
        this.path = path;
        this.error = error;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getPath() {
        return path;
    }

    public String getError() {
        return error;
    }
}
