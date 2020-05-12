//package com.emart.gatewayzuul.config;
//
//import com.emart.gatewayzuul.filter.JwtTokenAuthenticationFilter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.http.HttpServletResponse;
//
//@EnableWebSecurity
//public class SecurityTokenConfig extends WebSecurityConfigurerAdapter {
//
//    JwtConfig jwtConfig;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                // 使用无状态的session，session不会存储用户信息
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                // 处理尝试授权
//                .exceptionHandling().authenticationEntryPoint((req, rsp, e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//                .and()
//                // 添加过滤器验证每一次请求的token
//                .addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
//                .authorizeRequests()
//                // 允许所有用户访问auth
////                .antMatchers(HttpMethod.POST, jwtConfig.getUri()).permitAll()
//                // 必须拥有ADMIN角色才能访问到/gallery中的内容
//                .antMatchers("/gallery" + "/admin/**").hasRole("ADMIN")
//                // 其它所有请求都必须有授权
//                .anyRequest().authenticated();
//    }
//
////    @Bean
////    public JwtConfig jwtConfig() {
////        retu;
////    }
//}
