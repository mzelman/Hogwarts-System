package com.mz.hogwarts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mz.hogwarts.pojo.House;
import com.mz.hogwarts.repository.HouseRepository;
import com.mz.hogwarts.repository.StudentRepository;
import com.mz.hogwarts.service.HouseServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class HouseServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @Mock
    private HouseRepository houseRepository;

    @InjectMocks
    private HouseServiceImpl houseService;

    House house = new House(1L, "Gryffindor", 0, null);
    Optional<House> optionalHouse = Optional.of(house);

    @Test
    public void addPointsTest() {
        when(houseRepository.findById(1L)).thenReturn(optionalHouse);
        houseService.addPoints(1L, "10");
        assertEquals(10, house.getPoints());
    }

    @Test
    public void substractPointsTest() {
        when(houseRepository.findById(1L)).thenReturn(optionalHouse);
        houseService.substractPoints(1L, "10");
        assertEquals(-10, house.getPoints());
    }

}