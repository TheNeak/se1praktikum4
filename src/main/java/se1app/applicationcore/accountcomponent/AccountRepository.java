package se1app.applicationcore.accountcomponent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Neak on 03.12.2016.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByAccountNr(Integer accountNr);
}
