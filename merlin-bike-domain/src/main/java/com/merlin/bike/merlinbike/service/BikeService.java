package com.merlin.bike.merlinbike.service;

import com.merlin.bike.merlinbike.dtos.BikeDto;

public interface BikeService {

    Mono<BikeDto> save(final BikeDto bike);
}
