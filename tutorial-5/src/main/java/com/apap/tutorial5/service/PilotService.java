package com.apap.tutorial5.service;

import com.apap.tutorial5.model.PilotModel;

public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	
	void addPilot(PilotModel pilot);
	
	void deletePilot(Long idPilot);
	
	void updatePilot(PilotModel pilot, String licenseNumber);
}
