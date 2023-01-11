package com.example.springapp.config.security.oauth2.attributemapper;

import com.example.springapp.config.security.oauth2.OAuth2Request;
import com.example.springapp.domain.authaccount.entity.AuthProvider;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author Hyeonjun Park
 */
@Component
public class NaverAttributeMapper implements AttributeMappable {
  @Override
  public OAuth2Request mapToDTO(Map<String, Object> attributes) {

    Map<String, Object> response = (Map<String, Object>) attributes.get("response");

    String accountId = (String) response.get("id");
    String name = (String) response.get("name");
    String email = (String) response.get("email");
    return new OAuth2Request(accountId, name, email, AuthProvider.NAVER);
  }
}
