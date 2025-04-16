package mk.ukim.finki.eimt.lab.DataHolder;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.eimt.lab.Model.Domain.Booking;
import mk.ukim.finki.eimt.lab.Model.Domain.Country;
import mk.ukim.finki.eimt.lab.Model.Enumerations.BookingCategory;
import mk.ukim.finki.eimt.lab.Model.Domain.Host;
import mk.ukim.finki.eimt.lab.Repository.BookingRepository;
import mk.ukim.finki.eimt.lab.Repository.CountryRepository;
import mk.ukim.finki.eimt.lab.Repository.HostRepository;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr {

    private final CountryRepository countryRepository;
    private final HostRepository hostRepository;
    private final BookingRepository bookingRepository;

    public DataInitializr(CountryRepository countryRepository, HostRepository hostRepository, BookingRepository bookingRepository) {
        this.countryRepository = countryRepository;
        this.hostRepository = hostRepository;
        this.bookingRepository = bookingRepository;
    }

    @PostConstruct
    public void initializeData() {
        Country country1 = new Country("Macedonia", "Europe");
        Country country2 = new Country("Brasil", "South America");
        Country country3 = new Country("Japan", "Asia");

        this.countryRepository.save(country1);
        this.countryRepository.save(country2);
        this.countryRepository.save(country3);

        Host host1 = new Host("Ivan", "Pupinoski", country1);
        Host host2 = new Host("Lucas", "Oliveira", country2);
        Host host3 = new Host("Hiroshi", "Tanaka", country3);

        this.hostRepository.save(host1);
        this.hostRepository.save(host2);
        this.hostRepository.save(host3);

        Booking booking1 = new Booking("BOOKING_1", BookingCategory.ROOM, host1, 5);
        Booking booking2 = new Booking("BOOKING_2", BookingCategory.APARTMENT, host2, 1);
        Booking booking3 = new Booking("BOOKING_3", BookingCategory.HOTEL, host3, 3);

        this.bookingRepository.save(booking1);
        this.bookingRepository.save(booking2);
        this.bookingRepository.save(booking3);
    }
}
