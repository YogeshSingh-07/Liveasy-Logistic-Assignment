package com.LiveasyLogisticproject.LiveasyLogisticDatabase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.LiveasyLogisticproject.LiveasyLogisticDatabase.dao.LiveasyLogisticRepos;
import com.LiveasyLogisticproject.LiveasyLogisticDatabase.entity.LiveasyLogistic;


@Service
public class LiveasyLogisticServiceImpl implements LiveasyLogisticService {


	LiveasyLogisticRepos liveasyLogisticRepo;
	
	
	public LiveasyLogisticServiceImpl(LiveasyLogisticRepos liveasyLogisticRepo) {
		this.liveasyLogisticRepo=liveasyLogisticRepo;
	}

	@Override
	public List<LiveasyLogistic> getAllDetails() {
		
		return liveasyLogisticRepo.findAll();
	}

	@Override
	public LiveasyLogistic getDetailsById(int id) {
		Optional<LiveasyLogistic> opt = liveasyLogisticRepo.findById(id);
		
		return opt.get();
	}

	@Override
	public void saveLiveasyLogistic(LiveasyLogistic liveasyLogistic) {
		
		liveasyLogisticRepo.save(liveasyLogistic);
		
	}

	@Override
	public void deleteLiveasyLogisticById(int id) {
		liveasyLogisticRepo.deleteById(id);
		
	}
	
	@Override
	public LiveasyLogistic updateLiveasyLogistic(LiveasyLogistic liveasyLogistic) {
		
		return liveasyLogisticRepo.save(liveasyLogistic);
	}
	

}
