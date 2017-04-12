package org.dashvodN.DAO;

import org.dashvodN.module.UVVVSTAT;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UVVVSTATDAO extends PagingAndSortingRepository<UVVVSTAT, Long>,JpaSpecificationExecutor<UVVVSTAT>{

}
