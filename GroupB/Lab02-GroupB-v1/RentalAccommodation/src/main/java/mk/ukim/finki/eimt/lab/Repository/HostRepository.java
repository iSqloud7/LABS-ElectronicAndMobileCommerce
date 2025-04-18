package mk.ukim.finki.eimt.lab.Repository;

import mk.ukim.finki.eimt.lab.Model.Domain.Host;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostRepository extends JpaRepository<Host, Long> {
}
