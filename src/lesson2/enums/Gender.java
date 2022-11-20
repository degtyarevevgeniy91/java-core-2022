package lesson2.enums;

import lombok.Getter;

public enum Gender {
    MALE(true), FEMALE(false);
@Getter
private boolean pipka;

    Gender() {
    }


    Gender(boolean pipka) {
        this.pipka = pipka;
    }
}
