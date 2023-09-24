package com.example.person.dao;

import com.example.person.domain.RealPerson;
import com.example.person.model.RealPersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RealPersonRepository extends JpaRepository<RealPerson, Long> {

    @Modifying
    @Query(value = """
        UPDATE real_person p SET
        p.first_name =      :#{#model.firstName},
        p.last_name =       :#{#model.lastName},
        p.national_number = :#{#model.nationalNumber},
        p.birth_date =      :#{#model.birthDate},
        p.email =           :#{#model.email},
        p.address =         :#{#model.address},
        p.phone_number =    :#{#model.phoneNumber}
        WHERE p.national_number = :oldNationalNumber
        """, nativeQuery = true)
    void updateRealPersonByNationalNumber(RealPersonModel model, String oldNationalNumber);

    @Modifying
    void deleteRealPersonByNationalNumber(String nationalNumber);

    RealPerson findRealPersonByNationalNumber(String nationalNumber);
}