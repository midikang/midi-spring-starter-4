package com.midi.spring.starter.data;

import com.midi.spring.starter.model.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
