package ru.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.domain.Logo;
public interface LogoRepository extends PagingAndSortingRepository<Logo,Long>{

}
