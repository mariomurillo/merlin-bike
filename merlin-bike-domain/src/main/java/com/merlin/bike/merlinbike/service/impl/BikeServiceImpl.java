package com.merlin.bike.merlinbike.service.impl;

import com.merlin.bike.merlinbike.dtos.BikeDto;
import com.merlin.bike.merlinbike.service.BikeService;
import com.merlin.bike.merlinbike.service.Mono;

@Service
public class BikeServiceImpl implements BikeService {

    private BikeRepository repository;

    @Override
    public Mono<BikeDto> save(final BikeDto bike) {
        // TODO Auto-generated method stub
        return respoistory.save(Bike.builder.model(bike.getModel()).price(bike.getPrice()).build());
    }
}
