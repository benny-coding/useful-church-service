package kr.usefulService.church.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuantityRepository extends JpaRepository<Quantity, Long>{

    @Query("SELECT q FROM Quantity q WHERE q.purpose = ?1 ORDER BY q.date ASC")
    List<Quantity> findThisMonthASC(String purpose);
}
