package com.gla.TheStreamAPI.StreamAPI;

import java.util.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }
}
public class MembershipFilter {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("A", LocalDate.now().plusDays(10)),
                new Member("B", LocalDate.now().plusDays(40))
        );

        list.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}
