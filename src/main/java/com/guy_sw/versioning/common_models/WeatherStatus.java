package com.guy_sw.versioning.common_models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class WeatherStatus {

  private String city;
  private WindDirection windDirection;
  private double temperatureCelsius;

}
