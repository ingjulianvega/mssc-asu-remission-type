package ingjulianvega.ximic.msscasuremissiontype.bootstrap;

import ingjulianvega.ximic.msscasuremissiontype.domain.RemissionTypeEntity;
import ingjulianvega.ximic.msscasuremissiontype.domain.repositories.RemissionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class RemissionTypeLoader implements CommandLineRunner {

    private final RemissionTypeRepository remissionTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        if (remissionTypeRepository.count() == 0) {
            loadRemissionTypeObjects();
        }
    }

    private void loadRemissionTypeObjects() {
        remissionTypeRepository.saveAll(Arrays.asList(
                RemissionTypeEntity.builder().name("Exámenes de sangre").build(),
                RemissionTypeEntity.builder().name("Ecografía").build(),
                RemissionTypeEntity.builder().name("Rayos x").build(),
                RemissionTypeEntity.builder().name("Tomografía").build(),
                RemissionTypeEntity.builder().name("Otra").build()
        ));
    }
}