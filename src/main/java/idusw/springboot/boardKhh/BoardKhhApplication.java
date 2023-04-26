package idusw.springboot.boardKhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
public class BoardKhhApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardKhhApplication.class, args);
    }

}
