/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demozuul.filter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationProcessingFilter;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

/**
 *
 * @author robson
 */
public class ApiTokenAccessFilter extends OAuth2AuthenticationProcessingFilter {

  public ApiTokenAccessFilter(ResourceServerTokenServices resourceServerTokenServices) {

    super();
    setStateless(false);
    setAuthenticationManager(oauthAuthenticationManager(resourceServerTokenServices));
  }

  private AuthenticationManager oauthAuthenticationManager(ResourceServerTokenServices tokenServices) {

    OAuth2AuthenticationManager oauthAuthenticationManager = new OAuth2AuthenticationManager();

    oauthAuthenticationManager.setResourceId("oauth2-resource");
    oauthAuthenticationManager.setTokenServices(tokenServices);
    oauthAuthenticationManager.setClientDetailsService(null);

    return oauthAuthenticationManager;
  }
}
