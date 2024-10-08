//package com.samftest.demo;
//
//import org.flywaydb.core.Flyway;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//public class notepad1 {
//    package com.samftest.demo;
//
//import org.flywaydb.core.Flyway;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//    @Testcontainers
//    public class TestcontainersTest {
//
//        @BeforeAll
//        static void beforeAll() {
//
//        }
//
//        @Container
//        private static PostgreSQLContainer<?> postgreSQLContainer =
//                new PostgreSQLContainer<>("postgres:latest")
//                        .withDatabaseName("sam-dao-unit-test")
//                        .withUsername("amigoscode")
//                        .withPassword("password");
//        @DynamicPropertySource
//        private static void registerDataSourceProperties(DynamicPropertyRegistry registry){
//            registry.add(
//                    "spring.datasource.url",
//                    ()-> postgreSQLContainer.getJdbcUrl()
//            );
//            registry.add(
//                    "spring.datasource.username",
//                    ()-> postgreSQLContainer.getUsername()
//            );
//            registry.add(
//                    "spring.datasource.password",
//                    ()-> postgreSQLContainer.getPassword()
//            );
//        }
//
//        @Test
//        void canStartPostGresDB() {
//            assertThat(postgreSQLContainer.isRunning()).isTrue();
//            assertThat(postgreSQLContainer.isCreated()).isTrue();
//            //assertThat(postgreSQLContainer.isHealthy()).isTrue();
//
//        }
//
//        @Test
//        void canApplyDbMigrationWithFlyWay() {
//            Flyway flyway = Flyway.configure().dataSource(
//                    postgreSQLContainer.getJdbcUrl(),
//                    postgreSQLContainer.getUsername(),
//                    postgreSQLContainer.getPassword()
//            ).load();
//            flyway.migrate();
//            System.out.println();
//        }
//    }
//
//}
