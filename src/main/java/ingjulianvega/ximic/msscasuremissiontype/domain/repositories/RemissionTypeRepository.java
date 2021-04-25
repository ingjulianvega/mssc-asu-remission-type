package ingjulianvega.ximic.msscasuremissiontype.domain.repositories;

import ingjulianvega.ximic.msscasuremissiontype.domain.RemissionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface RemissionTypeRepository extends JpaRepository<RemissionTypeEntity, UUID>, JpaSpecificationExecutor<RemissionTypeEntity> {
}
