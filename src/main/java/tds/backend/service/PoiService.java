package tds.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tds.backend.entity.Poi;
import tds.backend.repository.PoiRepository;

@Service
@RequiredArgsConstructor
public class PoiService {
  
  private final PoiRepository poiRepository;

  public void addPoi(Poi poi){
    poiRepository.add(poi);
  }

  public List<Poi> findPoi() {
    return poiRepository.findAll();
  }

  public Poi findOne(Long id){
    return poiRepository.findOne(id);
  }
}
