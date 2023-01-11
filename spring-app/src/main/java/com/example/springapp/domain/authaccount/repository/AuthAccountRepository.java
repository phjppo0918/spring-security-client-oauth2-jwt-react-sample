package com.example.springapp.domain.authaccount.repository;

import com.example.springapp.domain.authaccount.entity.AuthAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AuthAccountRepository extends JpaRepository<AuthAccount, UUID> {
  Optional<AuthAccount> findByAccountId(String accountId);

  boolean existsByAccountId(String accountId);
}
