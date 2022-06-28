package com.example;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.annotation.Order;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SpringbootJunitMockitoApplicationTests {


    @Autowired
    private UserService service;

    @MockBean
    private UserRepository repository;

    @Test
    @Order(1)
    public void getUsersTest() {
        when(repository.findAll()).thenReturn(Stream.of(new User(101, "suneel", 24, "nellore"), new User(102, "praveen", 35, "vizag")).collect(Collectors.toList()));
        assertEquals(2, service.getUsers().size());
    }

    @Test
    @Order(2)
    public void getUserByAddressTest()
    {
        String address = "nellore";
        when(repository.findByAddress(address)).thenReturn(Stream.of(new User(101, "suneel", 24, "nellore")).collect(Collectors.toList()));
        assertEquals(1,service.getUserbyAddress(address).size());
    }

    @Test
    @Order(3)
    public void saveUserTest()
    {
        User user = new User(103,"santhosh",28,"hyderabad");
        when(repository.save(user)).thenReturn(user);
        assertEquals(user, service.addUser(user));
    }

    @Test
    @Order(4)
    public void deleteUserTest()
    {
        User user = new User(103,"santhosh",28,"hyderabad");
        service.deleteUser(user);
        verify(repository,times(1)).delete(user);
    }

}
