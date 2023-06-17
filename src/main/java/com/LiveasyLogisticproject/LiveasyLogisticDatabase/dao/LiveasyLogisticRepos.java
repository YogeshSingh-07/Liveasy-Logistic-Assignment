package com.LiveasyLogisticproject.LiveasyLogisticDatabase.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.LiveasyLogisticproject.LiveasyLogisticDatabase.entity.LiveasyLogistic;



@Repository 
public interface LiveasyLogisticRepos extends JpaRepository<LiveasyLogistic, Integer>{

	@Query("SELECT ll FROM LiveasyLogistic ll where ll.shippedId = :shippedId")
	List<LiveasyLogistic> getByShippedId(String shippedId);
}
