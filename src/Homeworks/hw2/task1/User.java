package Homeworks.hw2.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private int id;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;


    public User(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
    }
}
