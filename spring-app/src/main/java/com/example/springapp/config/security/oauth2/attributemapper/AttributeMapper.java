package com.example.springapp.config.security.oauth2.attributemapper;


import com.example.springapp.config.security.oauth2.OAuth2Request;
import com.example.springapp.domain.authaccount.entity.AuthProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * attribute값을 dto로, user을 attribute로 변환해주는 클래스
 *
 * @author Hyeonjun Park
 */
@Component
@RequiredArgsConstructor
public class AttributeMapper {

  private final AttributeMapperFactory attributeMapperFactory;

  public OAuth2Request mapToUser(AuthProvider provider, Map<String, Object> attributes) {
    return attributeMapperFactory.get(provider).mapToDTO(attributes);
  }
}
