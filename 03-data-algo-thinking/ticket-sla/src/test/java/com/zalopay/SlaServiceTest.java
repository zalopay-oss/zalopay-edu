package com.zalopay;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.LocalDateTime;

@Test
public class SlaServiceTest {
    private SlaService slaService;

    @DataProvider(name = "slaData")
    public static Object[][] slaData() {
        return new Object[][]{
                {
                        LocalDateTime.of(2019, 4, 30, 10, 0),
                        LocalDateTime.of(2019, 4, 30, 11, 0),
                        Duration.ofSeconds(3600) // 1h
                },
                {
                        LocalDateTime.of(2019, 4, 30, 11, 30),
                        LocalDateTime.of(2019, 4, 30, 14, 0),
                        Duration.ofSeconds(3600) // 1h
                },
        };
    }


    @BeforeClass
    public void init() {
        slaService = new SlaServiceImpl();
    }

    // GIVEN
    @Test(dataProvider = "slaData")
    public void calculate(LocalDateTime start, LocalDateTime end, Duration expectedResult) {
        // WHEN
        Duration duration = slaService.calculate(start, end);

        // THEN
        MatcherAssert.assertThat(duration, Is.is(expectedResult));
    }
}