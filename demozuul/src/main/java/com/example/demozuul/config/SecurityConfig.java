package com.example.demozuul.config;

import com.example.demozuul.filter.ApiTokenAccessFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String CSRF_COOKIE_NAME = "XSRF-TOKEN";
    private static final String CSRF_HEADER_NAME = "X-XSRF-TOKEN";


  @Autowired
  private ResourceServerTokenServices tokenServices;
  
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/auth/**").permitAll()
                .anyRequest().authenticated()
            .and()
            .csrf().disable()
            .logout().permitAll()
            .logoutSuccessUrl("/")
            .and()
            .addFilterAfter(new ApiTokenAccessFilter(tokenServices), AbstractPreAuthenticatedProcessingFilter.class)                
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.NEVER)    ;
    }

    

}
