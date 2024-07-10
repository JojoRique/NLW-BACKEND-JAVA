package com.rocketseat.planner.trip;

import java.util.UUID;

public record TripCreateResponse(UUID tripID) {
    public TripCreateResponse(UUID id) {

    }
}
