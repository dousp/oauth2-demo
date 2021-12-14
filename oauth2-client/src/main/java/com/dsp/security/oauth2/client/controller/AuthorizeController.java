package com.dsp.security.oauth2.client.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/authorize")
public class AuthorizeController {

    @GetMapping("/client")
    public Map<String, Object> client(@RegisteredOAuth2AuthorizedClient("ddd") OAuth2AuthorizedClient client) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Map<String, Object> map = new HashMap<>();
        map.put("authentication", authentication);
        map.put("oAuth2AuthorizedClient", client);
        return map;
    }

}
