package com.apap.tutorial5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apap.tutorial5.model.PilotModel;
import com.apap.tutorial5.repository.PilotDb;

@Service
@Transactional
public class PilotServiceImpl implements PilotService {
	@Autowired
	private PilotDb pilotDb;

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		return pilotDb.findByLicenseNumber(licenseNumber);
	}

	@Override
	public void addPilot(PilotModel pilot) {
		pilotDb.save(pilot);
		
	}

	@Override
	public void deletePilot(Long idPilot) {
		pilotDb.deleteById(idPilot);
		
	}

	@Override
	public void updatePilot(PilotModel pilot, String licenseNumber) {
		PilotModel newPilot = pilotDb.findByLicenseNumber(licenseNumber);
		newPilot.setName(pilot.getName());
		newPilot.setFlyHour(pilot.getFlyHour());
		pilotDb.save(newPilot);
	}

}