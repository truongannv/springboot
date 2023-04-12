package com.example.studentmanager.Repository;

import com.example.studentmanager.Model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CertificateRepository extends JpaRepository<Certificate,Integer> {
  @Query(value = "SELECT u FROM Certificate u")
  int[] ListCertificate();
}
