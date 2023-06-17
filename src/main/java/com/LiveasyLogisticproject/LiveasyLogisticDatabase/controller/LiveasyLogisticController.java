package com.LiveasyLogisticproject.LiveasyLogisticDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.LiveasyLogisticproject.LiveasyLogisticDatabase.dao.LiveasyLogisticRepos;
import com.LiveasyLogisticproject.LiveasyLogisticDatabase.entity.LiveasyLogistic;
import com.LiveasyLogisticproject.LiveasyLogisticDatabase.service.LiveasyLogisticServiceImpl;



@RestController
@RequestMapping("/")
public class LiveasyLogisticController {


	@Autowired
	LiveasyLogisticServiceImpl liveasyLogisticSvc;
	
	@Autowired
	LiveasyLogisticRepos liveasyLogisticRepo;
	
	
	@RequestMapping(value="/load",method=RequestMethod.GET)
	public List<LiveasyLogistic>  getAllDetails(){
		return liveasyLogisticSvc.getAllDetails();
	}
	
	@GetMapping("/load/{loadId}")
	public LiveasyLogistic getLiveasyLogisticById(@PathVariable int loadId) {
		return liveasyLogisticSvc.getDetailsById(loadId);
		
	}
	
	@PostMapping("/load")
	public void saveEmployee(@RequestBody LiveasyLogistic liveasyLogistic) {
		liveasyLogisticSvc.saveLiveasyLogistic(liveasyLogistic);
	}
	
	@PutMapping("/load/{loadId}")
	public LiveasyLogistic updateLiveasyLogistic(@PathVariable int loadId, @RequestBody LiveasyLogistic liveasyLogistic) {
		 liveasyLogistic.setLoadId(loadId);
		return liveasyLogisticSvc.updateLiveasyLogistic(liveasyLogistic);
		 
	}
	
	@DeleteMapping("/load/{loadId}")
	public void deleteEmployee(@PathVariable int loadId) {
		liveasyLogisticSvc.deleteLiveasyLogisticById(loadId);
	}
	
	@GetMapping("/loads/{shippedId}")
	public ResponseEntity<List<LiveasyLogistic>> getDeatilsbyShippedId(@PathVariable String shippedId){
		return new ResponseEntity<List<LiveasyLogistic>>(liveasyLogisticRepo.getByShippedId(shippedId), HttpStatus.OK);
	}
}
