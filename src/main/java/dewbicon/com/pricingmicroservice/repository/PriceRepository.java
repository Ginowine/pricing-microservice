package dewbicon.com.pricingmicroservice.repository;

import dewbicon.com.pricingmicroservice.entity.Price;
import org.springframework.data.repository.CrudRepository;


public interface PriceRepository extends CrudRepository<Price, Long> {
}
