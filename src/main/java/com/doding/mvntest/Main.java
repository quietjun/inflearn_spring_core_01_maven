package com.doding.mvntest;

import com.doding.mvntest.dto.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUserId("hong");
        System.out.println(user.getUserId());
        System.out.println(user);

        User user2 = new User();
        user2.setUserId("hong");
        System.out.println(user.equals(user2));

        // user2.setUserId(null);

        User user3 = new User("hong", "1234", 10, "seoul");
        User user4 = new User("hong", "1234");

        User user5 = User.builder().userId("jang").userPass("1234").age(10).build();
        User user6 = User.builder().userId("kim").userPass("1234").addr("seoul").build();

    }
}