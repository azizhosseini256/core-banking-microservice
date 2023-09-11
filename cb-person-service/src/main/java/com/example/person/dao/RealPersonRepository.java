package com.example.person.dao;

import com.example.person.domain.RealPerson;
import com.example.person.model.RealPersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface RealPersonRepository extends JpaRepository<RealPerson, Long> {

    // TODO fix this method
    @Modifying
    @Query(value = """
            update real_person p
            set p.first_name         =?1
              , p.last_name            =?2
              , p.national_number      =?3
              , p.birth_date            =?4
              , p.email               =?5
              , p.address             =?6
              , p.phone_number         =?7
            where p.national_number  =?3
            """, nativeQuery = true)
    void updateRealPersonByNationalNumber(@RequestBody RealPersonModel model);

    @Modifying
    void deleteRealPersonByNationalNumber(String nationalNumber);

    RealPerson findRealPersonByNationalNumber(String nationalNumber);
}