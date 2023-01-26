package org.example;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Александр")
                .setSurname("Горных")
                .setAge(93)
                .setAddress("Москва")
                .build();

        mom.happyBirthday();
        mom.happyBirthday();
        mom.happyBirthday();

        mom.setAddress("Пушкинский дворце");

        Person son = mom.newChildBuilder()
                .setName("Артур")
                .setAge(73)
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        if (son.hasAddress()) {
            System.out.println(son.getName() + " " + son.getSurname() +
                    " проживает вместе с отцом в " + son.getAddress() + ".");
        }

        try {
            new PersonBuilder().setAge(99).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}