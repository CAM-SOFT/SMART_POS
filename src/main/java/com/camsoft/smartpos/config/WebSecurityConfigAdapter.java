package com.camsoft.smartpos.config;


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfigAdapter extends WebSecurityConfigurerAdapter {
//
//	private static String REALM="MY_TEST_REALM";
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.sessionManagement()
//				.sessionFixation().none()
//				.and()
//				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//We don't need sessions to be created.
//
//		http.authorizeRequests()
//			.antMatchers(
//					"/zkau*",				// <--- for zk ajax (internal)
//					"/login*", "/logout",	// <--- for login/logout
//					"/js/**", 	// <--- static resources...
//					"/css/**",
//					"/bootstrap/**",
//					"/img/**",
//					"/static/resources/**"
//					)
//			.permitAll().anyRequest().authenticated().and()
//			.headers().frameOptions().disable().and()
//			.formLogin().permitAll().defaultSuccessUrl("/", true).and() // this redirect always to index.zul page
//			.logout().permitAll().and()
//			.csrf().disable();
//
//	}
//
//	@Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		//login user uuu / ppp
//		auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("user123")).roles("USER");
//		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin123")).roles("ADMIN");
//    }
//
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	/* To allow Pre-flight [OPTIONS] request from browser */
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//	}
//
//	@Bean
//	public BasicAuthenticateEntryPoint getBasicAuthEntryPoint(){
//		return new BasicAuthenticateEntryPoint();
//	}
//}
