package com.midi.spring.starter.data;

import java.util.List;

import com.midi.spring.starter.model.Spittle;


public interface SpittleRepository {

  List<Spittle> findRecentSpittles();

  List<Spittle> findSpittles(long max, int count);
  
  Spittle findOne(long id);

  void save(Spittle spittle);

}
