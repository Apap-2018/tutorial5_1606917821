package com.apap.tutorial5.service;

import java.util.List;

import com.apap.tutorial5.model.FlightModel;

public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(Long flightId);
	void updateFlight (FlightModel flight, long id);
	FlightModel findFlightByFlightNumber (String flightNumber);
	FlightModel getFlight (long id);
	List<FlightModel> allFlight();
}