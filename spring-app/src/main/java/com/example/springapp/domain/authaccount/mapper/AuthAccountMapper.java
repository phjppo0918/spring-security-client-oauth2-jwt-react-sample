package com.example.springapp.domain.authaccount.mapper;

import com.example.springapp.domain.authaccount.entity.AuthAccount;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AuthAccountMapper {
  public Map<String, Object> mapToAttributeMap(AuthAccount user) {
    Map<String, Object> attributes = new HashMap<>();
    attributes.put("id", user.getId());
    attributes.put("accountId", user.getAccountId());

    return attributes;
  }
}
