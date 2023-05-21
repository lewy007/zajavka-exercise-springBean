package pl.zajavka.service;

import org.springframework.stereotype.Component;
import pl.zajavka.domain.User;

@Component
public class StringPreparationService {

    public String prepare(final User user) {
        return String.format("%s%s", user.getBirth_date(), user.getEmail());
    }
}
