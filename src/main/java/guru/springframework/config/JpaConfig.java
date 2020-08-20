package guru.springframework.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "guru.springframework.repository")
@EntityScan(basePackages = {"guru.springframework.entity"})
public class JpaConfig {
}
