package pl.zajavka.service;

import pl.zajavka.domain.User;

public class StringPreparationService {

    public String prepare(final User user) {
        return String.format("%s%s", user.getBirth_date(), user.getEmail());
    }
}
