//package com.emart.gatewayzuul.filter;
//
//import com.emart.gatewayzuul.config.JwtConfig;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * @package: cn.lannis.cloud.zuul.core.security
// * @description: 验证配置类
// **/
//public class JwtTokenAuthenticationFilter extends OncePerRequestFilter {
//    private final JwtConfig jwtConfig;
//
//    public JwtTokenAuthenticationFilter(JwtConfig jwtConfig) {
//        this.jwtConfig = jwtConfig;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//            throws ServletException, IOException {
//
//        // 1. 获取授权Header，Tokens应位于header中
//        String header = request.getHeader(jwtConfig.getHeader());
//
//        System.out.println("header:"+header);
//        // 2. 验证Header和Prefix
//        if (header == null || !header.startsWith(jwtConfig.getPrefix())) {
//            chain.doFilter(request, response);        // If not valid, go to the next filter.
//            return;
//        }
//        //如果没有提供令牌，则不会对用户进行身份验证。
//        //可能是访问公共路径或请求令牌的用户。
//        //需要令牌的所有安全路径都已在config类中定义和保护。
//        //如果用户试图在没有访问令牌的情况下进行访问，则不会对其进行身份验证，并将引发异常。
//        // 3. 获取Token
//        String token = header.replace(jwtConfig.getPrefix(), "");
//
//        try {
//            // 如果令牌过期，则在创建声明时可能引发异常
//            // 4. 验证Token
//            Claims claims = Jwts.parser()
//                    .setSigningKey(jwtConfig.getSecret().getBytes())
//                    .parseClaimsJws(token)
//                    .getBody();
//            String username = claims.getSubject();
//            if (username != null) {
//                @SuppressWarnings("unchecked")
//                List<String> authorities = (List<String>) claims.get("authorities");
//                // 5. Create auth object
//                // UsernamePasswordAuthenticationToken：一个内置对象，spring使用它来表示当前经过身份验证/正在进行身份验证的用户。
//                // 它需要一个权限列表，该列表具有一个GrantedAuthority接口类型，其中SimpleGrantedAuthority是该接口的一个实现
//                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
//                        username, null, authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
//
//                // 6. 授权用户
//                SecurityContextHolder.getContext().setAuthentication(auth);
//            }
//
//        } catch (Exception e) {
//            // 以防失败。保证用户不会被认证
//            SecurityContextHolder.clearContext();
//        }
//
//        // 进入下一个过滤连
//        chain.doFilter(request, response);
//    }
//}
