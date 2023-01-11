package com.example.springapp.config.security.oauth2;

import com.example.springapp.config.security.jwt.JwtSetupService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * OAuth2 사용지 인증 성공시 진행하는 Handler
 *
 * @author Hyeonjun Park
 */
@Component
@RequiredArgsConstructor
public class OAuth2AuthSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
  private final JwtSetupService jwtSetupService;

  @Override
  public void onAuthenticationSuccess(
      HttpServletRequest request, HttpServletResponse response, Authentication authentication)
      throws IOException {

    LoginUser loginUser = getOAuthUser((OAuth2User) authentication.getPrincipal());
    jwtSetupService.addJwtTokensInCookie(response, loginUser);
    response.sendRedirect("/");
  }

  private LoginUser getOAuthUser(OAuth2User oAuth2User) {
    return new LoginUser(oAuth2User.getAttribute("id"), oAuth2User.getAttribute("nickname"));
  }
}
