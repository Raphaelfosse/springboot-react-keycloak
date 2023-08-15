package com.ivanfranchin.tournamentsapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TournamentNotFoundException extends RuntimeException {

    public TournamentNotFoundException(String id) {
        super("Tournament with ID '%s' not found".formatted(id));
    }
}