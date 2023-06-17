package com.LiveasyLogisticproject.LiveasyLogisticDatabase.service;

import java.util.List;

import com.LiveasyLogisticproject.LiveasyLogisticDatabase.entity.LiveasyLogistic;


public interface LiveasyLogisticService {
	
	
	public List<LiveasyLogistic> getAllDetails();
	
	public LiveasyLogistic getDetailsById(int id);
	
	public void saveLiveasyLogistic(LiveasyLogistic liveasyLogistic);
	
	public void deleteLiveasyLogisticById(int id);
	
	public LiveasyLogistic updateLiveasyLogistic(LiveasyLogistic liveasyLogistic);
	
	

}
