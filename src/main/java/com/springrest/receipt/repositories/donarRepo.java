package com.springrest.receipt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.receipt.entities.donarDetails;

@Repository
public interface donarRepo extends JpaRepository<donarDetails, Long>{

}
