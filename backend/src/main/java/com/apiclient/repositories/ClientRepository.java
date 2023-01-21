package com.apiclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiclient.entites.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long>{

}
