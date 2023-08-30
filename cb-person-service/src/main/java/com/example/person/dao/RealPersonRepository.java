package com.example.person.dao;

import com.example.person.domain.RealPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RealPersonRepository extends JpaRepository<RealPerson, Long> {

    RealPerson findRealPersonByNationalNumber(String nationalNumber);

    @Modifying
    @Query("delete from RealPerson p where p.nationalNumber = ?1")
    void deleteRealPersonByNationalNumber( String nationalNumber);
}
