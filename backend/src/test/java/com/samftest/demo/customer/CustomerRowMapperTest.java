package com.samftest.demo.customer;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CustomerRowMapperTest {

    @Test
    void mapRow() throws SQLException {
        //Given
        CustomerRowMapper customerRowMapper = new CustomerRowMapper();
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.getInt("id")).thenReturn(1);
        when(resultSet.getString("name")).thenReturn("sam");
        when(resultSet.getInt("age")).thenReturn(16);
        when(resultSet.getString("email")).thenReturn("sam@gmail.com");

        //When
        Customer actual = customerRowMapper.mapRow(resultSet,1);

        //Then
        Customer expected = new Customer(
                1,"sam","sam@gmail.com",16);
        assertThat(actual).isEqualTo(expected);
    }
}