package com.intellibus.bigparser;

import com.intellibus.bigparser.model.AuthorizationContext;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiAuthorisationService implements RequestInterceptor {
    private AuthorizationContext authContext;

    @Override
    public void apply(RequestTemplate template) {
        template.header("authId", authContext.getAuthId());
    }
}
