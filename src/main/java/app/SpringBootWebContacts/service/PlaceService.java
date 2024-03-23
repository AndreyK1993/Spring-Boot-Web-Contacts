package app.SpringBootWebContacts.service;

import app.SpringBootWebTours.entity.Place;
import app.SpringBootWebTours.repository.PlaceRepository;
import app.SpringBootWebTours.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PlaceService {

    @Autowired
    PlaceRepository repository;

    public List<Place> getTours() {
        Iterable<Place> iterable = repository.findAll();
        List<Place> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(place -> new Place(place.getId(),
                                Constants.URL_IMAGES + place.getImg(),
                                place.getName(),
                                place.getDescr()))
                        .toList();
        return new ArrayList<>(list);
    }
}
