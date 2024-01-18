package br.com.alura.screensound;

import br.com.alura.screensound.main.Main;
import br.com.alura.screensound.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreensoundApplication implements CommandLineRunner {

    @Autowired
    private ArtistaRepository artistaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ScreensoundApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main(artistaRepository);
        main.exibeMenu();
    }
}
